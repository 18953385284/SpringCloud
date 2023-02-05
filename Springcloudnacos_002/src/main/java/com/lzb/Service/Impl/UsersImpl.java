package com.lzb.Service.Impl;
import com.lzb.Mapper.UsersMapper;
import com.lzb.Pojo.Identity;
import com.lzb.Pojo.User;
import com.lzb.Service.UsersService;
import com.lzb.clients.SpringCloudNaCos01Clients;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author lzb
 * @date 2023/1/31 21:42
 */
@Service
public class UsersImpl implements UsersService {
    @Resource
    UsersMapper usersMapper;

    @Resource
    SpringCloudNaCos01Clients springCloudNaCos01Clients;
//    @Resource
//    RestTemplate restTemplate;
    public User SelectUsers(int Id)  {
        User user = usersMapper.SelectUsers(Id);
//        //注意传入用户的id
//        String Url = "http://SpringCloudNaCos01/IdentitySelect/" +user.getId() ;
//        final Identity forObject = restTemplate.getForObject(Url, Identity.class);
//        user.setIdentity(forObject);

        Identity identity = springCloudNaCos01Clients.SelectIdentity(user.getId());
        user.setIdentity(identity);
        return user;
    }
}
