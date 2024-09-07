package com.honeybug.springpractice.components.payment;

import com.honeybug.springpractice.command.PaymentStrategyCommand;
import com.honeybug.springpractice.enums.PaymentMethod;
import com.honeybug.springpractice.interfaces.Strategiable;
import org.springframework.stereotype.Service;

@Service
public class PaypalStrategy implements Strategiable<PaymentMethod, PaymentStrategyCommand, PaymentStrategyCommand> {

    @Override
    public PaymentStrategyCommand execute(final PaymentStrategyCommand param) {
        return param.toBuilder()
                .description("paypal strategy processed")
                .isProcessed(true)
                .build();
    }

    @Override
    //롬복 Getter를 사용하기 싫다면, 이렇게도 가능
    public PaymentMethod getStrategyKey() {
        return PaymentMethod.PAYPAL;
    }
}
