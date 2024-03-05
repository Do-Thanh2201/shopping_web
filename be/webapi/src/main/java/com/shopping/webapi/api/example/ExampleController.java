package com.shopping.webapi.api.example;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExampleController {
    public String example() {
        return "";
    }
}
