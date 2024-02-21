package com.arjunshaji.aop.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AspectController {

    @PostMapping("/function/{amount}")
    public void function1(@PathVariable("amount") double amount) {
        // logging
        // authentication and authorization
        // data validation etc.............
        log.info("function1 business logic");
    }

    @PostMapping("/function")
    public void function2() {
        // logging
        // authentication and authorization
        // data validation etc.............
        log.info("function2 business logic");
    }

}
