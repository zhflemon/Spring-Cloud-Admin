package com.github.wxiaoqi.security.auth.client.exception;

/**
 *
 * @author ace
 * @date 2017/9/15
 */
public class JwtSignatureException extends Exception {
	/**
	* @Fields serialVersionUID : (用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = -5212856531145673218L;

	public JwtSignatureException(String s) {
		super(s);
	}
}
