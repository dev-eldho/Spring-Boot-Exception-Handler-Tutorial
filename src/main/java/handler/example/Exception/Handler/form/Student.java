package handler.example.Exception.Handler.form;

import handler.example.Exception.Handler.constraint.CourseCode;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Student {
    @NotNull(message="is required")
    private String name;
    private int age;
    @CourseCode(value = "TS", message = "coursecode must starts with TS")
    private String courseCode;
}
