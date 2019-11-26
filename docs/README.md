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
/adm/user.*

//su 채널별 유저리스트
/adm/userByChannel.* ? channelid=

//su 주문리스트
/adm/listOrder.*

//su 채널별 주문리스트
/adm/listOrderByChannel.* ? channelid=
