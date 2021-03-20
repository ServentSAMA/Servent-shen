package com.serventshen.config;

import com.serventshen.component.MyLocaleResolver;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author ：申文杰
 * @description：Spring MVC的配置类
 * 在MVC配置类上边加入@EnableWebMvc
 * @date ：2020/12/12 12:19
 */
//@EnableWebMvc注解表明不使用SpringBoot自带的自动配置而专用我们自己配置的
@EnableWebMvc
@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {

    private WebMvcProperties webMvcProperties;
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hello").setViewName("success");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/").addResourceLocations("classpath:/");
    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("index");
                registry.addViewController("/index.html").setViewName("index");
            }
        };
        return webMvcConfigurer;
    }
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
