package com.example.Learn;

import com.example.Learn.student.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//@RestController
//public class GetHello {
//    @RequestMapping(path = "/")
//    public List<Student> hello() {
//
//        return List.of(
//                new Student(
//
//                        1L,
//                        "Charlie",
//                        "charlie@charlesjobrien.com",
//                        LocalDate.of(2000, Month.JANUARY, 2),
//                        23
//
//                )
//        );
//    }
//}
