package com.kesen.ssm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @className: com.kesen.ssm-> Test
 * @description:
 * @author: kesen
 * @createDate: 2021-12-17 17:39
 * @version: 1.0
 */
public class Test {
    public static final Logger logger = LoggerFactory.getLogger(Test.class);

    @org.junit.Test
   public void test1() {
        logger.info("slf4j for info");
        logger.debug("slf4j for debug");
        logger.error("slf4j for error");
        logger.warn("slf4j for warn");

        String message = "Hello SLF4J";
        logger.info("slf4j message is : {}", message);
    }
}
