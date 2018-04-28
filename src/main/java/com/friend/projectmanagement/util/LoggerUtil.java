package com.friend.projectmanagement.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author gxy
 * @description 日志异常打印工具栏
 * @create 2018-04-27 11:30
 **/
public abstract class LoggerUtil {
	public static String convertException2String(Throwable e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		return sw.toString();
	}
}
