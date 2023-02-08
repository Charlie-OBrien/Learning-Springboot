package com.example.Learn.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

                 Student charlie =  new Student(

                            "Charlie",
                            "charlie@charlesjobrien.com",
                            LocalDate.of(2001, Month.JANUARY, 2)
                    );

            Student jon =  new Student(

                    "Jon",
                    "j.stewart@dailyshow.com",
                    LocalDate.of(2002, Month.JANUARY, 3)
            );
                repository.saveAll(
                        List.of(charlie, jon)
                );
        };
    }
}
