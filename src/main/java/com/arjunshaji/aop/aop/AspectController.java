package com.arjunshaji.aop.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AspectController {

    /* assume order creation before payment process */
    @PostMapping("/order/{amount}")
    public void order(@PathVariable("amount") double amount) {
        createOrder(amount);
        saveOrderToDatabase();
        log.info("order business logic.............");
    }

    @PostMapping("/payment")
    public void payment() {
        log.info("payment business logic.........");
    }



    private void saveOrderToDatabase() {
        // logging
        // authentication and authorization
        // json validation etc.............
        // business logic
    }

    private void createOrder(double amount) {
        // logging
        // authentication and authorization
        // json validation etc.............
        // business logic
    }
}
