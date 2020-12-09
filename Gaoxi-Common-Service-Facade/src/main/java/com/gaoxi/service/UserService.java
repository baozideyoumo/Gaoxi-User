package com.gaoxi.service;

import com.gaoxi.Entity.user.UserEntity;
import com.gaoxi.req.user.LoginReq;

public interface UserService {

    public UserEntity login(LoginReq loginReq);
}
