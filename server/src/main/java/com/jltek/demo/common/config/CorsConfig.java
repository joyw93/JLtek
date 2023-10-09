package com.jltek.demo.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

//    @Value("${cors.allowed-origin}")
    private String allowedOrigin = "http://127.0.0.1:8000";

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // 허용할 엔드포인트 패턴을 지정합니다.
                .allowedOrigins(allowedOrigin) // 허용할 오리진을 지정합니다.
                .allowedMethods("GET", "POST", "PUT", "DELETE"); // 허용할 HTTP 메서드를 지정합니다.
    }
}

