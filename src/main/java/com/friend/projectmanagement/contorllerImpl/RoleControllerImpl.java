package com.friend.projectmanagement.contorllerImpl;


import com.friend.projectmanagement.contorllerImpl.ControllerHelp.ApiResponse;
import com.friend.projectmanagement.controller.RoleController;
import com.friend.projectmanagement.dto.RoleDTO;
import com.friend.projectmanagement.service.RoleService;
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
@Api(tags = "")
@RequestMapping("/role")
public class RoleControllerImpl implements RoleController {
	@Resource
	private RoleService roleService;

	@PostMapping("/add")
	@ApiOperation(value = "添加", notes = "添加")
	public String add(@RequestBody RoleDTO roleDTO) {
		roleService.insert(roleDTO);
		return ApiResponse.success();
	}

	@DeleteMapping("/delete/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	@ApiImplicitParams({
			@ApiImplicitParam(required = true, name = "id", value = "主键ID", paramType = "path", dataType = "String")
	})
	public String delete(@PathVariable("id") String id) {
		roleService.delete(id);
		return ApiResponse.success();
	}

	@PutMapping("/update")
	@ApiOperation(value = "修改", notes = "修改")
	public String update(@RequestBody RoleDTO roleDTO) {
		roleService.update(roleDTO);
		return ApiResponse.success();
	}

	@GetMapping("/detail/{id}")
	@ApiOperation(value = "查询详情", notes = "查询详情")
	@ApiImplicitParams({
			@ApiImplicitParam(required = true, name = "id", value = "主键ID", paramType = "path", dataType = "String")
	})
	public String detail(@PathVariable("id") String id) {
		RoleDTO roleDTO = roleService.getById(id);
		return ApiResponse.success(roleDTO);
	}

	@GetMapping("/listPage")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@ApiImplicitParams({
			@ApiImplicitParam(required = true, name = "pageSize", value = "每页显示数量", paramType = "query", dataType = "int"),
			@ApiImplicitParam(required = true, name = "pageNum", value = "第几页", paramType = "query", dataType = "int")
	})
	public String listPage(@RequestParam("pageSize") int pageSize, @RequestParam("pageNum") int pageNum) {
		PageInfo<RoleDTO> p = roleService.findPage(pageSize, pageNum);
		return ApiResponse.success(p);
	}
}
