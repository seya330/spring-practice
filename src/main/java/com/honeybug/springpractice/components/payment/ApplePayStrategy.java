package com.honeybug.springpractice.components.payment;

import com.honeybug.springpractice.command.PaymentStrategyCommand;
import com.honeybug.springpractice.enums.PaymentMethod;
import com.honeybug.springpractice.interfaces.Strategiable;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class ApplePayStrategy implements Strategiable<PaymentMethod, PaymentStrategyCommand, PaymentStrategyCommand> {

    private final PaymentMethod strategyKey = PaymentMethod.APPLE_PAY;

    @Override
    public PaymentStrategyCommand execute(final PaymentStrategyCommand param) {
        return param.toBuilder().description("applePay strategy executed").isProcessed(true).build();
    }
}
