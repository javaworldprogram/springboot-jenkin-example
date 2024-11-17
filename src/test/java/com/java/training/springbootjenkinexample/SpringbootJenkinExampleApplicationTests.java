package com.java.training.springbootjenkinexample;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootJenkinExampleApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinExampleApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("contextLoads Test......");
        assertEquals(true, true);
    }

}
