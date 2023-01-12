package handler.example.Exception.Handler.controller;

import handler.example.Exception.Handler.exception.UserNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class TestController {

    @PostMapping(value = "/{id}")
    public String testHandler(@PathVariable int id) {
        if (id >= 5 && id <= 15) {
            throw new UserNotFoundException("user not found");
        }
        return "Hai Eldho";
    }


}
