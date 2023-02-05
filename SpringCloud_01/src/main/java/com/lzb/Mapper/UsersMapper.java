package com.lzb.Mapper;

import com.lzb.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author lzb
 * @date 2023/2/2 10:51
 */
@Mapper
public interface UsersMapper {
    @Select("select * from Identity where Id=#{Id}")
    User SelectUsers(int Id);
}
