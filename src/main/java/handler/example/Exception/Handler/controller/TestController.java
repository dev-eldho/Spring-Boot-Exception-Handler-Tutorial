package handler.example.Exception.Handler.controller;

import handler.example.Exception.Handler.exception.UserNotFoundException;
import handler.example.Exception.Handler.form.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/user")
public class TestController {

    @GetMapping("/{id}")
    public String testHandler(@PathVariable int id) {
        if (id >= 5 && id <= 15) {
            throw new UserNotFoundException("user not found");
        }
        return "Hai Eldho";
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insert(@Valid @RequestBody Student student, BindingResult bindingResult) {
        log.info("Student Info {}", student);
    }


}
