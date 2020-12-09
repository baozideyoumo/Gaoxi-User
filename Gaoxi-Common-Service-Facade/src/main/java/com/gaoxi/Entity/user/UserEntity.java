package com.gaoxi.Entity.user;

import com.gaoxi.Entity.enumeration.user.UserStateEnum;
import com.gaoxi.Entity.enumeration.user.UserTypeEnum;

import java.io.Serializable;
import java.sql.Timestamp;

public class UserEntity implements Serializable {

    /** 主键 */
    private String id;

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    /** 手机号 */
    private String phone;

    /** 邮箱 */
    private String mail;

    /** 营业执照照片 */
    private String licencePic;

    /** 注册时间 */
    private Timestamp registerTime;

    /** 用户类型 {@link com.gaoxi.Entity.enumeration.user.UserTypeEnum} */
    private UserTypeEnum userTypeEnum;

    /** 账号状态 {@link com.gaoxi.Entity.enumeration.user.UserStateEnum} */
    private UserStateEnum userStateEnum;

    /** 用户的角色 */
    private RoleEntity roleEntity;

}
