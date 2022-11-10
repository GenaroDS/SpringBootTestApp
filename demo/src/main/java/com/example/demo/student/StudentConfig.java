package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariana = new Student(
                    "mariana", "mariana@gmail.com",
                    LocalDate.of(1997, Month.APRIL, 5)
            );
            Student alex = new Student(
                    "alex", "alex@gmail.com",
                    LocalDate.of(1997, Month.DECEMBER, 3)
            );
            repository.saveAll(
                    List.of(mariana,alex)
            );
        };
    }
}
