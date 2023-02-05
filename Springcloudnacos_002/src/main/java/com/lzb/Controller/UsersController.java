package com.lzb.Controller;

import com.lzb.Pojo.Identity;
import com.lzb.Pojo.User;
import com.lzb.Service.UsersService;
import com.lzb.clients.SpringCloudNaCos01Clients;
import com.lzb.config.Hot_loading;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

/**
 * @author lzb
 * @date 2023/1/31 21:44
 */
@RestController
//@RefreshScope  //实现配置热更新
public class UsersController {
    @Resource
    UsersService usersService;

    @Resource
    SpringCloudNaCos01Clients springCloudNaCos01Clients;

//    @Value("${pattern.dateformat}")
//    private String dateformat;

    /**
     * 热更新
     */
    @Resource
    Hot_loading hot_loading;

    /**
     * NaCos配置
     * @return
     */
    @GetMapping(value = "prop")
    public Hot_loading loading(){
        return hot_loading;
    }

    /**
     * NaCos配置
     * @return
     */
    @GetMapping(value = "new")
    public String now(){
    return LocalDateTime.now()
        .format(DateTimeFormatter.ofPattern(hot_loading.dateformat, Locale.CHINA));
    }


    /**
     * Id查询
     * @param Id
     * @return
     */
    @GetMapping("SelectUsers/{Id}")
    User SelectUsers(@PathVariable("Id") int Id){
        return usersService.SelectUsers(Id);
    }

    @GetMapping("IdentityUsers")
    List<Identity> IdentityUsers(){
        return springCloudNaCos01Clients.SelectIdentityAll();
    }
}
