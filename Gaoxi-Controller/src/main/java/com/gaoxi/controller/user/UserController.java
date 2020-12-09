package com.gaoxi.controller.user;

import com.gaoxi.req.user.*;
import com.gaoxi.rsp.Result;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;

/**
 * @Date 2017/10/27 下午10:26
 */
@RestController
public interface UserController {

    /**
     * 登录
     * @param loginReq 登录请求参数
     * @param httpRsp HTTP响应
     * @return 登录是否成功
     */
    @GetMapping("/login")
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp);

}
