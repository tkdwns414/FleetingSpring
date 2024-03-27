package com.tkdwns414.Template.domain.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ERole {
    USER("user", "ROLE_USER"),
    ADMIN("admin", "ROLE_ADMIN");

    private final String name;
    private final String securityName;
}
