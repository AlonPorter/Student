package com.example.student.student;

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
            Student alon = new Student(
              1L,
                    "Alon",
                    "porter8594@gmail.com",
                    LocalDate.of(1994, Month.MAY,8)
            );
            Student naor = new Student(
                    "Naor",
                    "Naor@gmail.com",
                    LocalDate.of(1996, Month.MAY,8)
            );
            repository.saveAll(List.of(alon,naor));
        };
    }
}
