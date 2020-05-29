package com.sqt.edu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-05-29 11:25
 */
@Slf4j
@SpringBootApplication
public class APP_ADMIN {

    public static void main(String[] args) {
        SpringApplication.run(APP_ADMIN.class);
        log.info("==========> admin server successful !");
    }
}
