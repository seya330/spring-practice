package com.honeybug.springpractice.packageinfo.service;

import com.honeybug.springpractice.packageinfo.command.HaveNullableFieldCommand;
import com.honeybug.springpractice.packageinfo.nonnullpackage.NonNullDomainClass;

public class ServiceClass {

    public NonNullDomainClass test(HaveNullableFieldCommand command) {
        NonNullDomainClass nonNullDomainClass = new NonNullDomainClass();
        nonNullDomainClass.setAge(command.age());
        nonNullDomainClass.setName(command.name());
        nonNullDomainClass.setName(null);
        return nonNullDomainClass;
    }
}
