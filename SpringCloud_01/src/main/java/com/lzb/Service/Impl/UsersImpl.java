package com.lzb.Service.Impl;

import com.lzb.Mapper.UsersMapper;
import com.lzb.Pojo.User;
import com.lzb.Service.UsersService;
import lzb.Pojo.Identity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lzb
 * @date 2023/1/31 21:42
 */
@Service
public class UsersImpl implements UsersService {
    @Resource
    UsersMapper usersMapper;
    @Resource
    RestTemplate restTemplate;
    public User SelectUsers(int Id)  {
        User user = usersMapper.SelectUsers(Id);
        //注意传入用户的id
        String Url = "http://SpringCloud02/IdentitySelect/" +user.getId() ;
        final Identity forObject = restTemplate.getForObject(Url, Identity.class);
        user.setIdentity(forObject);
        return user;
    }
}
