package handler.example.Exception.Handler.custom;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class StudentError {
    int code;
    String message;
}
