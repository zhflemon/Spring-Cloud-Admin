package com.github.wxiaoqi.security.common.exception.auth;

import com.github.wxiaoqi.security.common.constant.CommonConstants;
import com.github.wxiaoqi.security.common.exception.BaseException;

/**
 * Created by ace on 2017/9/8.
 */
public class UserTokenException extends BaseException {
	/**
	* @Fields serialVersionUID : (用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = -6374443727265432827L;

	public UserTokenException(String message) {
		super(message, CommonConstants.EX_USER_INVALID_CODE);
	}
}
