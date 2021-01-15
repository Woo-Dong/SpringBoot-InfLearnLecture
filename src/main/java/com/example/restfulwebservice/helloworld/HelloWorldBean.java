package com.example.restfulwebservice.helloworld;

// lombok
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// 자동으로 생성자 관련 method 사용 가능
// getMessage, setMessage, ...

public class HelloWorldBean {
    private String message;

}
