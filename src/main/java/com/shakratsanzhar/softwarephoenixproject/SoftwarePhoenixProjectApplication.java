package com.shakratsanzhar.softwarephoenixproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SoftwarePhoenixProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoftwarePhoenixProjectApplication.class, args);
    }

}
