package com.fxz.service;

import com.fxz.dto.UserLoginDTO;
import com.fxz.entity.User;

public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
