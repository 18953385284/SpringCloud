package lzb.Mapper;

import lzb.Pojo.Identity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lzb
 * @date 2023/1/31 22:15
 */
@Mapper
public interface IdentityMapper {
    @Select("select * from Identity where Id=#{Id}")
    Identity SelectIdentity(int Id);
}
