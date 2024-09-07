package com.honeybug.springpractice.service;

import com.honeybug.springpractice.domain.OrderSheet;
import com.honeybug.springpractice.enums.OrderStatus;
import com.honeybug.springpractice.interfaces.StrategyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService extends StrategyService<OrderStatus, OrderSheet, Void> {

    public void test() {
        strategies.forEach((key, value) -> value.execute(OrderSheet.builder().build()));
    }
}
