//유저생성
insert into user(userid,pw,name,kind,regdate) values(?,?,?,?,?);

//채널생성
insert into channel(name,regdate,channelkey) values(?,?,?);


//주문배정
insert into assignorder(orderpkey,channerid,userpkey,status,assigndate) values(?,?,?,'ASSIGN',now());


//채널에 유저생성
insert into channelauthuser(channelid,userpkey,reldate,canassign) values(?,?,now(),?)

//주문입력
insert into orders(channelid,name,age,sex,phone,ismobile,agcode,invencode,customcode,regdate,status,extras) values(?,?,?,?,?,?,?,?,?,now(),'ORDERED',?);

//주문 배정 제외
insert into orderuseraware(orderpkey,userpkey,channerid) values(?,?,?);


//주문 상태변경.
update order set status=?;

//마스킹
update order set masking = ?;

//배정 주문 상태 처리.
update assignorder set resulttxt=? , status=? , closedate=?;

//su 유저리스트
select * from user;

//su 채널별 유저리스트
select * from user ,channelauthuser cau where cau.userpkey = user.userpkey and cau.channelid=?

//su 주문리스트
select * from orders

//su 채널별 주문리스트
select * from orders where channelid = ?
