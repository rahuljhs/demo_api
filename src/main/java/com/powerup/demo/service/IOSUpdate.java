package com.powerup.demo.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class IOSUpdate {
    private final String model;
    private final double currentVersion;
    private final boolean updateAvailable;
    private final double latestVersion;
}
