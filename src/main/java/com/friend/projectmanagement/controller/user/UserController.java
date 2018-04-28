package com.friend.projectmanagement.controller.user;

public interface UserController {
    /**
     * 获取用户信息
     *
     * @param id 用户编号
     * @return 用户具体信息
     */
    String userInfo(String id);
}
