package com.serventshen.serventshen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
@ComponentScan("com.serventshen")
public class ServentShenApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServentShenApplication.class, args);
    }
    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }


    private static class MyViewResolver implements ViewResolver{

        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
}
