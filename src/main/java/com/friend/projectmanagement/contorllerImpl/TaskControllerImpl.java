package com.friend.projectmanagement.contorllerImpl;


import com.friend.projectmanagement.contorllerImpl.ControllerHelp.ApiResponse;
import com.friend.projectmanagement.controller.TaskController;
import com.friend.projectmanagement.dto.TaskDTO;
import com.friend.projectmanagement.service.TaskService;
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
@RequestMapping("/task")
public class TaskControllerImpl implements TaskController {
	@Resource
	private TaskService taskService;

	@PostMapping("/add")
	@ApiOperation(value = "添加", notes = "添加")
	public String add(@RequestBody TaskDTO taskDTO) {
		taskService.insert(taskDTO);
		return ApiResponse.success();
	}

	@DeleteMapping("/delete/{id}")
	@ApiOperation(value = "删除", notes = "删除")
	@ApiImplicitParams({
			@ApiImplicitParam(required = true, name = "id", value = "主键ID", paramType = "path", dataType = "String")
	})
	public String delete(@PathVariable("id") String id) {
		taskService.delete(id);
		return ApiResponse.success();
	}

	@PutMapping("/update")
	@ApiOperation(value = "修改", notes = "修改")
	public String update(@RequestBody TaskDTO taskDTO) {
		taskService.update(taskDTO);
		return ApiResponse.success();
	}

	@GetMapping("/detail/{id}")
	@ApiOperation(value = "查询详情", notes = "查询详情")
	@ApiImplicitParams({
			@ApiImplicitParam(required = true, name = "id", value = "主键ID", paramType = "path", dataType = "String")
	})
	public String detail(@PathVariable("id") String id) {
		TaskDTO taskDTO = taskService.getById(id);
		return ApiResponse.success(taskDTO);
	}

	@GetMapping("/listPage")
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@ApiImplicitParams({
			@ApiImplicitParam(required = true, name = "pageSize", value = "每页显示数量", paramType = "query", dataType = "int"),
			@ApiImplicitParam(required = true, name = "pageNum", value = "第几页", paramType = "query", dataType = "int")
	})
	public String listPage(@RequestParam("pageSize") int pageSize, @RequestParam("pageNum") int pageNum) {
		PageInfo<TaskDTO> p = taskService.findPage(pageSize, pageNum);
		return ApiResponse.success(p);
	}
}
