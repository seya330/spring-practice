package com.honeybug.springpractice.components;

import com.honeybug.springpractice.interfaces.FooInterface;
import org.springframework.stereotype.Service;

@Service
public class FirstFooClass implements FooInterface {

    @Override
    public void runFoo() {
        System.out.println("FirstFooClass.runFoo");
    }
}
