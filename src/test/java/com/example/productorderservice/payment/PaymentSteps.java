package com.example.productorderservice.payment;

public class PaymentSteps {
    public static PaymentRequest 주문결제_요청() {
        final Long orderId = 1L;
        final String cardNumber = "1234-1234-1234-1234";
        return new PaymentRequest(orderId, cardNumber);
    }
}