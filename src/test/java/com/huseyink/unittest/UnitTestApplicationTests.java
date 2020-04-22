package com.huseyink.unittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UnitTestApplicationTests {

    @Test
    void sayHelloToWorld() {

        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World!",helloWorld.sayHello(), "Say Hello to world");
    }

}
