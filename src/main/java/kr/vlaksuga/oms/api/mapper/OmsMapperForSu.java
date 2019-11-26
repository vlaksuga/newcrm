package kr.vlaksuga.oms.api.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


@Mapper
public interface OmsMapperForSu {


    @Select("select now()")
    Map getNow();


    @Select("select now()")
    List<Map> getperson(@Param("movieid") String movieid);

    @Select("select * from user")
    List<Map> listUser();

    @Select("select * from user ,channelauthuser cau where cau.userpkey = user.userpkey and cau.channelid=#{channelid}")
    List<Map> listUserByChannel(@Param("channelid") String channelid);

    @Select("select * from orders")
    List<Map> listOrder();

    @Select("select * from orders where channelid = #{channelid}")
    List<Map> listOrderByChannel(@Param("channelid") String channelid);

    @Select("select * from channel")
    List<Map> listChannel();

}
