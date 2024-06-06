package com.examples.docker;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthStatus implements HealthIndicator {
    @Override
    public Health getHealth(boolean includeDetails) {
        System.out.println("Health indicator called...");
        return Health.unknown().build();
    }

    @Override
    public Health health() {
        System.out.println("Health indicator called...");
        // TODO: DB STATUS CHECK
        // TODO: MESSAGING SYSTEM STATUS CHECK
        return Health.unknown().build();
    }
}
