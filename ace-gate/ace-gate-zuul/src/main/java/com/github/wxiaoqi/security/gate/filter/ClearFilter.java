package com.github.wxiaoqi.security.gate.filter;

import org.springframework.stereotype.Component;

import com.github.wxiaoqi.security.common.context.BaseContextHandler;
import com.netflix.zuul.ZuulFilter;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-06-23 8:25
 */
@Component
// @Slf4j
public class ClearFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		BaseContextHandler.remove();
		return null;
	}

}
