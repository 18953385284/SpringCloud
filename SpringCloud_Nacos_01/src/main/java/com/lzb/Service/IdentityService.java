package com.lzb.Service;


import com.lzb.Pojo.Identity;

import java.util.List;

/**
 * @author lzb
 * @date 2023/1/31 22:17
 */
public interface IdentityService {
    Identity SelectIdentity(int Id);

    List<Identity> SelectIdentityAll();
}
