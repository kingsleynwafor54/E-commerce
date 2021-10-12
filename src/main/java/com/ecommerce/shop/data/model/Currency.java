package com.ecommerce.shop.data.model;

public enum Currency {
    NGN("Naira"),USD("Dollar"),SRC("Singapore Dollar"),GBP("British Pounds"),FRC("Franc"),GHC("Ghana Cedis");

    private String name;

        Currency(String s){
            this.name=s;
        }

    private String getName(String name){
        return name;
    }
}
