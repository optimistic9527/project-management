package com.friend.projectmanagement.contorllerImpl;


import com.friend.projectmanagement.contorllerImpl.ControllerHelp.ApiResponse;
import com.friend.projectmanagement.contorllerImpl.ControllerHelp.ResultCode;
import com.friend.projectmanagement.controller.UserController;
import com.friend.projectmanagement.dto.UserDTO;
import com.friend.projectmanagement.service.UserService;
import com.friend.projectmanagement.util.SecurityUtil;
import com.friend.projectmanagement.util.StringUtils;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Controller
 *
 * @author gxy_code_tool
 * @date 2018-05-10
 */
@RestController
@Api(tags = "用户控制层")
@RequestMapping("/user")
public class UserControllerImpl implements UserController {
	@Resource
	private UserService userService;

	@PostMapping("/add")
	@ApiOperation(value = "添加", notes = "添加")
	public String add(@RequestBody UserDTO userDTO) {
		userService.insert(userDTO);
		return ApiResponse.success();
	}

	@DeleteMapping("/delete/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	@ApiImplicitParams({
			@ApiImplicitParam(required = true, name = "id", value = "主键ID", paramType = "path", dataType = "String")
	})
	public String delete(@PathVariable("id") String id) {
		userService.delete(id);
		return ApiResponse.success();
	}

	@PutMapping("/update")
	@ApiOperation(value = "修改", notes = "修改")
	public String update(@RequestBody UserDTO userDTO) {
		userService.update(userDTO);
		return ApiResponse.success();
	}

	@GetMapping("/detail/{id}")
	@ApiOperation(value = "查询详情", notes = "查询详情")
	@ApiImplicitParams({
			@ApiImplicitParam(required = true, name = "id", value = "主键ID", paramType = "path", dataType = "String")
	})
	public String detail(@PathVariable("id") String id) {
		UserDTO userDTO = userService.getById(id);
		return ApiResponse.success(userDTO);
	}

	@GetMapping("/list_page")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@ApiImplicitParams({
			@ApiImplicitParam(required = true, name = "pageSize", value = "每页显示数量", paramType = "query", dataType = "int"),
			@ApiImplicitParam(required = true, name = "pageNum", value = "第几页", paramType = "query", dataType = "int")
	})
	public String listPage(@RequestParam("pageSize") int pageSize, @RequestParam("pageNum") int pageNum) {
		PageInfo<UserDTO> p = userService.findPage(pageSize, pageNum);
		return ApiResponse.success(p);
	}

	@PostMapping("/sign_in")
	@ApiOperation(value = "用户登陆", notes = "登陆接口")
	@ApiImplicitParams({
			@ApiImplicitParam(required = true, name = "username", value = "用户名称", paramType = "query", dataType = "String"),
			@ApiImplicitParam(required = true, name = "password", value = "用户密码", paramType = "query", dataType = "String")
	})
	public String signIn(@RequestParam("username") String username, @RequestParam("password") String password) {
		String pwd = SecurityUtil.passwordMD5Encode(password, "UTF-8");
		UserDTO userDTO = userService.findUserByUsernamePassword(username, pwd);
		if (userDTO == null) {
			return ApiResponse.failure(ResultCode.USER_NOT_EXIST);
		}
		return ApiResponse.success(userDTO);
	}

	@Override
	@PostMapping("/sign_up")
	@ApiOperation(value = "注册", notes = "注册接口")
	public String signUp(@RequestBody UserDTO userDTO) {
		boolean nullOrEmpty = StringUtils.isNullOrEmpty(userDTO.getName(), userDTO.getPassword());
		if (nullOrEmpty) {
			return ApiResponse.failure(ResultCode.PARAM_NOT_COMPLETE);
		}
		userDTO.setPassword(SecurityUtil.passwordMD5Encode(userDTO.getPassword(), "UTF-8"));
		userService.insert(userDTO);
		return ApiResponse.success();
	}
}
