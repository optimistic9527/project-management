package com.friend.projectmanagement.controller.user;


import com.alibaba.fastjson.JSONObject;
import com.friend.projectmanagement.dao.UserMapper;
import com.friend.projectmanagement.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;


/**
 * @author gxy
 * @description 用户controller层
 * @create 2018-04-23 21:12
 **/
@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "用户信息查询", description = "用户基本信息操作API", tags = "UserApi", consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class UserControllerImpl implements UserController {
    @Override
    @GetMapping("/user_info")
    @ApiOperation(value = "获取用户信息", notes = "根据用户ID获取用户信息")
    @ApiImplicitParam(name = "id", value = "用户编号", required = true, dataType = "String")
    public String userInfo(String id) {
        return "success";
    }

}
