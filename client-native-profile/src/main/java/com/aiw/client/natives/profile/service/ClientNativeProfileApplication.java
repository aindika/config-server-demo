package com.aiw.client.natives.profile.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientNativeProfileApplication implements CommandLineRunner {

    Logger log = LoggerFactory.getLogger(ClientNativeProfileApplication.class);


    @Value("${api.message}")
    private String url;

    public static void main(String[] args) {
        SpringApplication.run(ClientNativeProfileApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(url);
    }
}
