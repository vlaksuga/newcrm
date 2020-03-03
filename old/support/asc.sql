ALTER TABLE `userauth` DROP FOREIGN KEY `fk_userauth_user_1`;
ALTER TABLE `user` DROP FOREIGN KEY `fk_user_logon_1`;
ALTER TABLE `pm` DROP FOREIGN KEY `fk_pm_user_1`;
ALTER TABLE `pm` DROP FOREIGN KEY `fk_pm_user_2`;
ALTER TABLE `logon` DROP FOREIGN KEY `fk_logon_userauth_1`;

DROP TRIGGER `pointguard`;
DROP TRIGGER `cashguard`;
DROP TRIGGER `pointinit`;
DROP TRIGGER `cashinit`;
DROP INDEX `qwertyuiop` ON `userauth`;
DROP INDEX `gtrtr` ON `userauth`;
DROP INDEX `fref` ON `pm`;

DROP TABLE `user`;
DROP TABLE `userauth`;
DROP TABLE `logon`;
DROP TABLE `pm`;

CREATE TABLE `user` (
`userpkey` bigint NOT NULL AUTO_INCREMENT,
`lastacesstoken` varchar(255) NULL,
`status` varchar(30) NOT NULL,
`point` bigint(255) NOT NULL DEFAULT 0,
`cash` bigint(255) NOT NULL DEFAULT 0,
`nick` varchar(255) NULL,
`color` varchar(255) NULL,
`gender` varchar(255) NULL,
`country` varchar(255) NULL,
PRIMARY KEY (`userpkey`) 
);
CREATE TRIGGER `pointguard` Before UPDATE ON `user` FOR EACH ROW BEGIN

if NEW.point < -5000 then
	signal sqlstate '40001' set message_text = 'too low value';
end if;

END;;
CREATE TRIGGER `cashguard` Before UPDATE ON `user` FOR EACH ROW BEGIN

if NEW.cash < -5000 then
	signal sqlstate '40001' set message_text = 'too low value';
end if;

END;;
CREATE TRIGGER `pointinit` Before INSERT ON `user` FOR EACH ROW BEGIN
set NEW.point := 0;
END;
CREATE TRIGGER `cashinit` Before INSERT ON `user` FOR EACH ROW BEGIN
set NEW.cash := 0;
END;

CREATE TABLE `userauth` (
`userpkey` bigint NOT NULL,
`kind` varchar(50) NOT NULL DEFAULT 'legacy',
`userid` varchar(50) NOT NULL,
`authtoken` varchar(255) NOT NULL,
PRIMARY KEY (`userpkey`, `kind`) ,
UNIQUE INDEX `qwertyuiop` (`authtoken` ASC),
UNIQUE INDEX `gtrtr` (`kind` ASC, `authtoken` ASC)
);
CREATE TABLE `logon` (
`acesstoken` varchar(255) NOT NULL,
`kind` varchar(50) NOT NULL,
`authtoken` varchar(255) NOT NULL,
`deviceadid` int(11) NOT NULL,
`lastaccessdate` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
`os` varchar(100) NOT NULL,
`ip` varchar(30) NULL,
PRIMARY KEY (`acesstoken`) 
);
CREATE TABLE `pm` (
`pmpkey` bigint NOT NULL,
`userpkey` bigint NOT NULL,
`kind` varchar(20) NOT NULL,
`issuedate` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
`readdate` datetime NOT NULL DEFAULT '99991231' ON UPDATE CURRENT_TIMESTAMP,
`status` varchar(20) NOT NULL DEFAULT 'NORMAL' COMMENT '\'NORMAL\',\'DELETED\'',
`memo` text NOT NULL,
`sender` bigint NOT NULL,
PRIMARY KEY (`pmpkey`) ,
INDEX `fref` (`status` ASC, `userpkey` ASC, `issuedate` ASC)
);

ALTER TABLE `userauth` ADD CONSTRAINT `fk_userauth_user_1` FOREIGN KEY (`userpkey`) REFERENCES `user` (`userpkey`);
ALTER TABLE `user` ADD CONSTRAINT `fk_user_logon_1` FOREIGN KEY (`lastacesstoken`) REFERENCES `logon` (`acesstoken`);
ALTER TABLE `pm` ADD CONSTRAINT `fk_pm_user_1` FOREIGN KEY (`userpkey`) REFERENCES `user` (`userpkey`);
ALTER TABLE `pm` ADD CONSTRAINT `fk_pm_user_2` FOREIGN KEY (`sender`) REFERENCES `user` (`userpkey`);
ALTER TABLE `logon` ADD CONSTRAINT `fk_logon_userauth_1` FOREIGN KEY (`kind`, `authtoken`) REFERENCES `userauth` (`kind`, `authtoken`);

