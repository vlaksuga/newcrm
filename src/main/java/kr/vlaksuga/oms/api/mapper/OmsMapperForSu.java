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

}
