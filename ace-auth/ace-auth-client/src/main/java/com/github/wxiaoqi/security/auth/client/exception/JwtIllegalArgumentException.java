package com.github.wxiaoqi.security.auth.client.exception;

/**
 * Created by ace on 2017/9/15.
 */
public class JwtIllegalArgumentException extends Exception {
	/**
	* @Fields serialVersionUID : (用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = 2014723666694013696L;

	public JwtIllegalArgumentException(String s) {
		super(s);
	}
}
