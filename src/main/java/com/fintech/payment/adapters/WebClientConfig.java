package com.fintech.payment.adapters;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;

@Service
public class ResilienceConfig {
    @CircuitBreaker(name = "default", fallbackMethod = "fallback")
    @Retry(name = "default")
    public String externalServiceCall() {
        // Simulate a call to an external service
        return "Success";
    }

    public String fallback(Throwable t) {
        return "Fallback";
    }
}