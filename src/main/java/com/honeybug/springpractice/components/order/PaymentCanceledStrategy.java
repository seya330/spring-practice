package com.honeybug.springpractice.components.order;

import com.honeybug.springpractice.domain.OrderSheet;
import com.honeybug.springpractice.enums.OrderStatus;
import com.honeybug.springpractice.interfaces.Strategiable;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class PaymentCanceledStrategy implements Strategiable<OrderStatus, OrderSheet, Void> {

    private final OrderStatus strategyKey = OrderStatus.PAYMENT_CANCELED;

    @Override
    public Void execute(final OrderSheet orderSheet) {
        System.out.println("payment canceled strategy");
        return null;
    }
}
