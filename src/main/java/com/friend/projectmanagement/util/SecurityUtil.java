package com.friend.projectmanagement.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;

/**
 * @author gxy
 * @description 用户密码加密
 * @create 2018-04-27 10:55
 **/
public abstract class SecurityUtil {
	private final static Logger log = LoggerFactory.getLogger(SecurityUtil.class);

	public static String passwodrMD5Encode(String origin, String charsetName) {
		String resultString = null;
		try {
			resultString = origin + Const.SALT;
			MessageDigest md = MessageDigest.getInstance("MD5");
			if (charsetName == null || "".equals(charsetName))
				resultString = byteArrayToHexString(md.digest(resultString
						.getBytes()));
			else
				resultString = byteArrayToHexString(md.digest(resultString
						.getBytes(charsetName)));
		} catch (Exception exception) {
			log.error(LoggerUtil.convertException2String(exception));
		}
		return resultString;
	}

	private static String byteArrayToHexString(byte[] b) {
		StringBuilder resultSb = new StringBuilder();
		for (byte aB : b) resultSb.append(byteToHexString(aB));
		return resultSb.toString();
	}

	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n += 256;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}

	private static final String hexDigits[] = {"0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

}
