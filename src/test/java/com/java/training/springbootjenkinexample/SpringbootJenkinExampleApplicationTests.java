package com.java.training.springbootjenkinexample;



import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringbootJenkinExampleApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinExampleApplicationTests.class);

    @Test
    public void contextLoads() {
        logger.info("*********contextLoads Second Test Commit");

    }

}
