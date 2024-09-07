package com.honeybug.springpractice.domain;

import com.honeybug.springpractice.enums.OrderStatus;
import lombok.Builder;

@Builder
public class OrderSheet {

    private String orderSheetNumber;

    private OrderStatus status;

    private String description;

    private Boolean isProcessed;
}
