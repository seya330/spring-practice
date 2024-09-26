package com.honeybug.springpractice.packageinfo.command;

import jakarta.annotation.Nullable;

public record HaveNullableFieldCommand(
        @Nullable String name,
        int age
) {
}
