package com.friend.projectmanagement.controller;


import com.friend.projectmanagement.dto.UserDTO;

/**
 * Controller
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
public interface UserController {
	/**
	 * 添加User
	 *
	 * @param userDTO
	 * @return
	 */
	String add(UserDTO userDTO);

	/**
	 * 根据id删除User
	 *
	 * @param id
	 * @return
	 */
	String delete(String id);

	/**
	 * 修改User
	 *
	 * @param userDTO
	 * @return
	 */
	String update(UserDTO userDTO);

	/**
	 * 根据id获取User信息
	 *
	 * @param id
	 * @return
	 */
	String detail(String id);

	/**
	 * 分页
	 *
	 * @param pageSize 第几页
	 * @param pageNum  显示多少
	 * @return
	 */
	String listPage(int pageSize, int pageNum);

	/**
	 * 用户登陆接口
	 *
	 * @param username 用户名
	 * @param password 密码
	 * @return 登陆结果
	 */
	String signIn(String username, String password);

	/**
	 * 用户注册接口
	 *
	 * @param userDTO 用户传输数据
	 * @return
	 */
	String signUp(UserDTO userDTO);
}
