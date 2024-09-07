package com.honeybug.springpractice.service;

import com.honeybug.springpractice.command.PaymentStrategyCommand;
import com.honeybug.springpractice.enums.PaymentMethod;
import com.honeybug.springpractice.interfaces.Strategiable;
import com.honeybug.springpractice.interfaces.StrategyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.EnumSet;

@Service
@RequiredArgsConstructor
public class PaymentService extends StrategyService<PaymentMethod, PaymentStrategyCommand, PaymentStrategyCommand> {

    public void test() {
        EnumSet.allOf(PaymentMethod.class).stream().forEach(paymentMethod -> {
            final Strategiable<PaymentMethod, PaymentStrategyCommand, PaymentStrategyCommand> strategy = strategies.get(paymentMethod);
            if (strategy != null) {
                final PaymentStrategyCommand before = PaymentStrategyCommand.builder()
                        .paymentMethod(paymentMethod)
                        .description("before processed")
                        .isProcessed(false)
                        .build();
                final PaymentStrategyCommand after = strategy.execute(before);

                System.out.println("before" + before);
                System.out.println("after" + after);
            }
        });
    }
}

