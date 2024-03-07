package dev.patika.vetManagementSystem.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("https://effulgent-basbousa-114497.netlify.app/")
                .allowedMethods("GET","POST","PUT","DELETE")
                .allowCredentials(true);
    }

}
