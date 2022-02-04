package com.hvs.api.hello;

import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = HelloController.class)
class HelloControllerTest {

    @Autowired
    private HelloController controller;

    @org.junit.jupiter.api.Test
    void sayHello() {
        Assertions.assertEquals("Hello there!!!", controller.sayHello());
    }
}