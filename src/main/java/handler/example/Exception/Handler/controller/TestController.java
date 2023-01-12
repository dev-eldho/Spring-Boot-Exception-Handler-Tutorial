package handler.example.Exception.Handler.controller;

import handler.example.Exception.Handler.exception.UserNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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


}
