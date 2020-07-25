package com.example.accessdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessdatajpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessdatajpaApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(AccessdatajpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository repository){
        return args -> {
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));

            log.info("Customers with findAll()");
            for (Customer customer : repository.findAll()){
                log.info(customer.toString());
            }

            log.info("Customers with findByName('Bauer')");
            repository.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });


        };
    }

}
