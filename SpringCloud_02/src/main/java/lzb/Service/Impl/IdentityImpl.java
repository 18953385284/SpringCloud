package lzb.Service.Impl;

import lzb.Mapper.IdentityMapper;
import lzb.Pojo.Identity;
import lzb.Service.IdentityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lzb
 * @date 2023/1/31 22:19
 */
@Service
public class IdentityImpl implements IdentityService {
    @Resource
    IdentityMapper identityMapper;
    public Identity SelectIdentity(int Id) {
        return identityMapper.SelectIdentity(Id);
    }
}
