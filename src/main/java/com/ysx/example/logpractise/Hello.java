package com.ysx.example.logpractise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2019-04-21 07:36
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class Hello {

    private static final Logger LOGGER = LoggerFactory.getLogger(Hello.class);

    public static void main(String[] args) {
        LOGGER.trace("trace log");
        LOGGER.debug("debug log");
        LOGGER.info("info log");
        LOGGER.warn("warn log");
        LOGGER.error("error log");

    }
}
