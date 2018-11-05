package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        int i = Integer.valueOf("11001001",2);
        String s = Integer.toOctalString(i);
        String ss = Integer.toHexString(i);
        SpringApplication.run(DemoApplication.class, args);
    }
}
