package com.urlshortener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudNativeUrlShortenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudNativeUrlShortenerApplication.class, args);

        System.out.println("Hello World");


    }

}
