package com.yinrj.redisspringbootstarter;

import com.yinrj.redisspringbootstarter.annotation.EnableOwnAutoImport;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
@EnableOwnAutoImport
public class RedisSpringBootStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisSpringBootStarterApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ApplicationContext appContext) {
        return args -> {

            String[] beans = appContext.getBeanDefinitionNames();
            Arrays.stream(beans).sorted().forEach(System.out::println);

        };
    }

}
