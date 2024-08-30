package com.cbl.notification.account.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EnvironmentProfile {
    DEV("dev"),
    PROD("prod"),
    QA("qa"),
    UAT("uat");

    private final String profile;
}