package lzb.Controller;

import lombok.extern.slf4j.Slf4j;
import lzb.Pojo.Identity;
import lzb.Service.IdentityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lzb
 * @date 2023/1/31 22:22
 */
@RestController
@Slf4j
public class IdentityController {
    @Resource
    IdentityService identityService;
    @GetMapping(value = "IdentitySelect/{Id}")
    Identity IdentitySelect(@PathVariable("Id")  int Id){
        return identityService.SelectIdentity(Id);
    }
}
