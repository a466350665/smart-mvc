package com.smart.core.ruler.string;

import java.util.Objects;

import com.smart.core.ruler.Ruler;
import com.smart.core.util.ValidateUtils;

public class StrMobileRuler implements Ruler<String> {

	@Override
	public boolean check(String value) {
		return Objects.isNull(value) || ValidateUtils.isMobile(value);
	}

	@Override
	public String getMessage() {
		return "必须符合手机号格式";
	}
}