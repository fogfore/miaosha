package com.lingdian.service;

import com.lingdian.error.BusinessException;
import com.lingdian.service.model.UserModel;
import org.springframework.stereotype.Service;

public interface UserService {
    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;

    /**
     *
     * @param telphone 用户注册手机
     * @param encryptPassword 用户加密后的密码
     * @throws BusinessException
     */
    UserModel validateLogin(String telphone, String encryptPassword) throws BusinessException;
}
