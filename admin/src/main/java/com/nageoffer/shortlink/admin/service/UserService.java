package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dao.entity.UserDO;
import com.nageoffer.shortlink.admin.dto.req.UserLoginReqDTO;
import com.nageoffer.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.nageoffer.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 用户接口层
 */
@Component
public interface UserService extends IService<UserDO> {
    /**
     *  根据用户名查询用户信息
     * @param username  用户名
     * @return  用户返回实体
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 检查用户是否存在
     * @param username 用户名
     * @return 用户名存在返回True 不存在返回 False
     */
    Boolean hasUsername(String username);

    /**
     * 注销用户
     * @param requestParam 注册用户请求参数
     */
    void register(UserRegisterReqDTO requestParam);

    List <UserRespDTO> getAllUser();

    /**
     * 根据用户名修改用户
     * @param requestParam 修改用户请求参数
     */
    void update(UserUpdateReqDTO requestParam);


    /**
     * 用户登录
     * @param requestParam 用户登录请求参数
     * @return 用户登录返回参数 Token
     */
    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    /**
     * 检查用户是否登录
     * @param username 用户名
     * @param token    用户登录Token
     * @return  用户是否登录标识
     */
    Boolean checkLogin(String username, String token);
}
