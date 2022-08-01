package uz.net.firstspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uz.net.firstspring.dto.ResponseDto;
import uz.net.firstspring.dto.StudentDto;


import java.util.ArrayList;

@RestController
public class StudentController {
    public static ArrayList<StudentDto> students = new ArrayList<>();

    @PostMapping
    public ResponseDto addStudent(@RequestBody StudentDto studentDto){
        students.add(studentDto);

        return ResponseDto.builder()
                .code(0)
                .success(true)
                .message("Successfuly saved!")
                .build();
    }

//    @GetMapping
//    public ResponseDto updateStudent(@RequestBody StudentDto studentDto){
//        for(StudentDto s : students){
//            if (s.getId().equals(studentDto.getId())){
//
//            }
//        }
//    }


}