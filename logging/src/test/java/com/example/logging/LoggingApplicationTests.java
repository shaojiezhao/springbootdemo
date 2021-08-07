package com.example.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;

@SpringBootTest
class LoggingApplicationTests
{

    private static final Logger logger = LoggerFactory.getLogger(LoggingApplicationTests.class);

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void contextLoads()
    {
    }

    @Test
    public void containsBean()
    {
        logger.info(String.valueOf(applicationContext.containsBean("beanTest2")));
        logger.info(String.valueOf(applicationContext.containsBean("beanTest")));
    }

    @Test
    public void test()
    {
        logger.trace("这是trace日志");
        logger.debug("这是debug日志");
        logger.info("这是Info日志");
        logger.warn("这是warn日志");
        logger.error("这是error日志");
    }

}
