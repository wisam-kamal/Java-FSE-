package com.example.paymentservice.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Service
public class PaymentService {

    private final WebClient webClient = WebClient.create();

    @CircuitBreaker(name = "thirdPartyApiCB", fallbackMethod = "fallbackPayment")
    public String makePayment() {
        log.info("Calling third-party API...");
        return webClient
                .get()
                .uri("http://slow-api.com/pay")
                .retrieve()
                .bodyToMono(String.class)
                .block(); // simulate sync call
    }

    public String fallbackPayment(Throwable t) {
        log.error("Fallback executed due to: {}", t.toString());
        return "Payment failed. Please try again later.";
    }
}
