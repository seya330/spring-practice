package com.honeybug.springpractice.annotation;

import com.honeybug.springpractice.PaymentMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PaymentStrategy {

    PaymentMethod value();
}
