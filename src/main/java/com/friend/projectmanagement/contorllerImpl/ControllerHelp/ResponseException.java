package com.friend.projectmanagement.contorllerImpl.ControllerHelp;

/**
 * @author gxy
 * @description 用于自定义异常, 如果需要再Controller抛出异常请用次异常抛出，便于异常统一管理
 * @create 2018-05-10 11:01
 **/
public class ResponseException extends RuntimeException {

	public ResponseException(String errorMsg) {
		super(errorMsg);
	}
}
