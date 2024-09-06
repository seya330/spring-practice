package com.honeybug.springpractice.components;

import com.honeybug.springpractice.interfaces.FooInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class ServiceClass {

    private final Map<String, FooInterface> myFoos;

    public void test() {
        myFoos.forEach((key, value) -> value.runFoo());
    }
}

