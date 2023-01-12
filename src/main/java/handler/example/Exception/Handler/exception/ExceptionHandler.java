package handler.example.Exception.Handler.exception;

import handler.example.Exception.Handler.custom.StudentError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler
    public ResponseEntity<StudentError> handleException(UserNotFoundException exc) {
        StudentError se = StudentError.builder().code(HttpStatus.NOT_FOUND.value()).message(exc.getMessage()).build();
        return new ResponseEntity<>(se, HttpStatus.NOT_FOUND);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler
    public ResponseEntity<StudentError> handleException(Exception ex) {
        StudentError se = StudentError.builder().code(HttpStatus.BAD_REQUEST.value()).message(ex.getMessage()).build();
        return new ResponseEntity<>(se, HttpStatus.BAD_REQUEST);
    }


}
