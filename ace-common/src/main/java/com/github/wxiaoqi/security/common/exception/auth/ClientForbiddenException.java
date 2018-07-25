package com.github.wxiaoqi.security.common.exception.auth;

import com.github.wxiaoqi.security.common.constant.CommonConstants;
import com.github.wxiaoqi.security.common.exception.BaseException;

/**
 * Created by ace on 2017/9/12.
 */
public class ClientForbiddenException extends BaseException {
	/**
	* @Fields serialVersionUID : (用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = -1487984005835490779L;

	public ClientForbiddenException(String message) {
		super(message, CommonConstants.EX_CLIENT_FORBIDDEN_CODE);
	}

}
