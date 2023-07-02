package com.aiw.client.git.profile.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientGitProfileApplication implements CommandLineRunner {
    Logger log = LoggerFactory.getLogger(ClientGitProfileApplication.class);

    @Value("${api.message}")
    private String url;

    public static void main(String[] args) {
        SpringApplication.run(ClientGitProfileApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(url);
    }
}
