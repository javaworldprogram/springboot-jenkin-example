package com.java.training.springbootjenkinexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringbootJenkinExampleApplication {


    Logger logger= LoggerFactory.getLogger(SpringbootJenkinExampleApplication.class);

    public void init(){
        logger.info("Jenkins Demo started..........");

    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJenkinExampleApplication.class, args);
    }

}
