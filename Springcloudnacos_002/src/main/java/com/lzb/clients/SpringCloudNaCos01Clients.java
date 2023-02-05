package com.lzb.clients;

import com.lzb.Pojo.Identity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author lzb
 * @date 2023/2/4 18:25
 * 远程调用
 */
@FeignClient("SpringCloudNaCos01")//远程调用名称
public interface SpringCloudNaCos01Clients {
    /**
     * 通过Id进行查询
     * @param Id
     * @return
     */
    @GetMapping("IdentitySelect/{Id}")
    Identity SelectIdentity(@PathVariable("Id") int Id);

    /**
     * 查询全部
     * @return
     */
    @GetMapping("IdentitySelect")
    List<Identity> SelectIdentityAll();

}
