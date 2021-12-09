package br.com.itams.api.expense;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpenseApplication {

	public static void main(String[] args) {
		// Main
		SpringApplication.run(ExpenseApplication.class, args);

		System.out.println("teste");
	}
}
