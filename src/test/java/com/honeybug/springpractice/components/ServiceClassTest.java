package com.honeybug.springpractice.components;

import com.honeybug.springpractice.interfaces.FooInterface;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServiceClassTest {

    @Autowired
    ServiceClass serviceClass;

    @Test
    void test() {
        serviceClass.test();
    }
}
