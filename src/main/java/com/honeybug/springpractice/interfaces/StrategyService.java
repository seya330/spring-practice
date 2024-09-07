package com.honeybug.springpractice.interfaces;

import java.util.HashMap;
import java.util.Map;

public abstract class StrategyService<T extends Enum<T>, P, R> {

    protected final Map<T, Strategiable<T, P, R>> strategies = new HashMap<>();

    public void registerStrategy(Strategiable<T, P, R> strategiable) {
        strategies.put(strategiable.getStrategyKey(), strategiable);
    }
}
