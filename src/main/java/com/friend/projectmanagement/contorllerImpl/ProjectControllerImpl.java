package com.friend.projectmanagement.contorllerImpl;


import com.friend.projectmanagement.contorllerImpl.ControllerHelp.ApiResponse;
import com.friend.projectmanagement.controller.ProjectController;
import com.friend.projectmanagement.dto.ProjectDTO;
import com.friend.projectmanagement.service.ProjectService;
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
@Api(tags = "项目控制层")
@RequestMapping("/project")
public class ProjectControllerImpl implements ProjectController {
	@Resource
	private ProjectService projectService;

	@PostMapping("/add")
	@ApiOperation(value = "添加", notes = "添加")
	public String add(@RequestBody ProjectDTO projectDTO) {
		projectService.insert(projectDTO);
		return ApiResponse.success();
	}

	@DeleteMapping("/delete/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	@ApiImplicitParams({
			@ApiImplicitParam(required = true, name = "id", value = "主键ID", paramType = "path", dataType = "String")
	})
	public String delete(@PathVariable("id") String id) {
		projectService.delete(id);
		return ApiResponse.success();
	}

	@PutMapping("/update")
	@ApiOperation(value = "修改", notes = "修改")
	public String update(@RequestBody ProjectDTO projectDTO) {
		projectService.update(projectDTO);
		return ApiResponse.success();
	}

	@GetMapping("/detail/{id}")
	@ApiOperation(value = "查询详情", notes = "查询详情")
	@ApiImplicitParams({
			@ApiImplicitParam(required = true, name = "id", value = "主键ID", paramType = "path", dataType = "String")
	})
	public String detail(@PathVariable("id") String id) {
		ProjectDTO projectDTO = projectService.getById(id);
		return ApiResponse.success(projectDTO);
	}

	@GetMapping("/listPage")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@ApiImplicitParams({
			@ApiImplicitParam(required = true, name = "pageSize", value = "每页显示数量", paramType = "query", dataType = "int"),
			@ApiImplicitParam(required = true, name = "pageNum", value = "第几页", paramType = "query", dataType = "int")
	})
	public String listPage(@RequestParam("pageSize") int pageSize, @RequestParam("pageNum") int pageNum) {
		PageInfo<ProjectDTO> p = projectService.findPage(pageSize, pageNum);
		return ApiResponse.success(p);
	}
}
