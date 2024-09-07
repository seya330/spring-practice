package com.honeybug.springpractice.components.order;

import com.honeybug.springpractice.domain.OrderSheet;
import com.honeybug.springpractice.enums.OrderStatus;
import com.honeybug.springpractice.interfaces.Strategiable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
public class OrderCreatedStrategy implements Strategiable<OrderStatus, OrderSheet, Void> {

    private final OrderStatus strategyKey = OrderStatus.ORDER_CREATED;

    @Override
    public Void execute(final OrderSheet param) {
        System.out.println("order created strategy");
        return null;
    }
}
