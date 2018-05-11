package com.friend.projectmanagement.util;

import java.util.Arrays;

/**
 * @author gxy
 * @description 字符串处理工具类
 * @create 2018-05-11 16:55
 **/
public abstract class StringUtils {
	/**
	 * @param object
	 * @return
	 */
	public static boolean isNullOrEmpty(String... object) {
		return Arrays.stream(object).allMatch(s -> s == null || s.isEmpty());
	}
}
