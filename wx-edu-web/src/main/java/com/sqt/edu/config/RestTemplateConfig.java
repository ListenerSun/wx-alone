package com.sqt.edu.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplateConfig
 *
 * @author ListenerSun(男, 未婚) 微信:810548252
 * @date 19-4-9
 */
@Configuration
@Slf4j
public class RestTemplateConfig {


    @Bean
    public RestTemplate restTemplate() {
       return new RestTemplate();
    }
}
