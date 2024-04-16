package com.tkdwns414.Template.dto.common;

import com.tkdwns414.Template.dto.type.ErrorCode;
import jakarta.validation.constraints.NotNull;

public record ExceptionDto (
        @NotNull Integer code,
        @NotNull String message
) {

    public static ExceptionDto of(ErrorCode errorCode) {
        return new ExceptionDto(
                errorCode.getCode(),
                errorCode.getMessage()
        );
    }
}
