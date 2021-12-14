package br.com.itams.expense;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableAuthorizationServer
@SpringBootApplication
public class ExpenseAuthorizationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpenseAuthorizationServerApplication.class, args);
    }

}
