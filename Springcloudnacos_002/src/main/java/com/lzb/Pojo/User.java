package com.lzb.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author lzb
 * @date 2023/1/31 21:36
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class User {
    private int usersId;
    private String usersName;
    private String usersPawd;
    private Identity identity;
    private int Id;
}
