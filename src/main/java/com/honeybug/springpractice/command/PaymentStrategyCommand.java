package com.honeybug.springpractice.command;

import com.honeybug.springpractice.enums.PaymentMethod;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class PaymentStrategyCommand {

    PaymentMethod paymentMethod;

    String description;

    Boolean isProcessed;
}
