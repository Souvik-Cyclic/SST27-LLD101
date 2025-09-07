package com.example.payments;

import java.util.Objects;

public class FastPayAdapter implements PaymentGateway {
    private final FastPayClient fastPayClient;

    public FastPayAdapter(FastPayClient fastPayClient) {
        this.fastPayClient = Objects.requireNonNull(fastPayClient);
    }

    @Override
    public String charge(String customerId, int amountCents) {
        return fastPayClient.payNow(customerId, amountCents);
    }
}
