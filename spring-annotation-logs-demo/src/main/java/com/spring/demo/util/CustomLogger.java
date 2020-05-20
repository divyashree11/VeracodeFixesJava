package com.spring.demo.util;

import org.apache.log4j.Logger;
import org.springframework.web.util.HtmlUtils;

public class CustomLogger {
	
	public static final Logger LOGGER = getLoggerClass();

	private static Logger getLoggerClass() {
		StackTraceElement callerClass = Thread.currentThread().getStackTrace()[3];
		return Logger.getLogger(callerClass.getClass());
	}

	public void info(String msg) {
		//escape vulnerable characters like '<', '>', etc to remediate vulnerability
		LOGGER.info(HtmlUtils.htmlEscape(msg));
	}
	public void debug(String msg) {
		//escape vulnerable characters like '<', '>', etc to remediate vulnerability
		LOGGER.debug(HtmlUtils.htmlEscape(msg));
	}

}
