package com.lzb.Controller;

import com.lzb.Pojo.User;
import com.lzb.Service.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lzb
 * @date 2023/1/31 21:44
 */
@RestController
public class UsersController {
    @Resource
    UsersService usersService;
    @GetMapping("SelectUsers/{Id}")
    User SelectUsers(@PathVariable("Id") int Id){
        return usersService.SelectUsers(Id);
    }
}
