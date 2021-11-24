package com.sprta.memoprac2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Memoprac2Application {

    public static void main(String[] args) {
        SpringApplication.run(Memoprac2Application.class, args);
    }

}
