package mongoexample.controller;


import mongoexample.models.Student;
import mongoexample.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/student")
public class MyController {


    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/")

    public ResponseEntity<?> addStudent(@RequestBody Student st){

        Student save=this.studentRepository.save(st);
        return ResponseEntity.ok(save);

    }
    @GetMapping("/")

    public ResponseEntity<?> getStudent(){

        return ResponseEntity.ok(this.studentRepository.findAll());
//        main thing is that how we will be doing the configuration

    }
}
