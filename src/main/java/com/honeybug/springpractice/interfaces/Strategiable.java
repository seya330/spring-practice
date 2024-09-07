package com.honeybug.springpractice.interfaces;

import org.springframework.beans.factory.annotation.Autowired;

public interface Strategiable<T extends Enum<T>, P, R> {

    R execute(P param);

    @Autowired
    default void registerMe(StrategyService<T, P, R> strategyService) {
        strategyService.registerStrategy(this);
        System.out.println(strategyService);
    }

    T getStrategyKey();
}
