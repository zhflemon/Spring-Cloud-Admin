package com.github.wxiaoqi.security.common.exception.auth;

import com.github.wxiaoqi.security.common.constant.CommonConstants;
import com.github.wxiaoqi.security.common.exception.BaseException;

/**
 * Created by ace on 2017/9/10.
 */
public class ClientInvalidException extends BaseException {
	/**
	* @Fields serialVersionUID : (用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = -7743650649753676963L;

	public ClientInvalidException(String message) {
		super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
	}
}
