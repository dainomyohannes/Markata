package com.futureB.backend.dtos;

import com.google.gson.annotations.SerializedName;

public class PaymentDTO {


    private Double amount;
    private String currency;
    private String type;
    private String paymentMethodId;
    private String cardNumber;
    private Integer exp_month;
    private Integer exp_year;
    private String cvc;

//    static class CreatePaymentItem {
//        @SerializedName("id")
//        String id;
//
//        public String getId() {
//            return id;
//        }
//    }
//
//    static class CreatePayment {
//        @SerializedName("items")
//        CreatePaymentItem[] items;
//
//        public CreatePaymentItem[] getItems() {
//            return items;
//        }
//    }
}
