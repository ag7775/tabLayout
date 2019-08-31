package com.example.modabba;

public class Modal {

    String plan,price,skips;

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSkips() {
        return skips;
    }

    public void setSkips(String skips) {
        this.skips = skips;
    }

    public Modal(String plan, String price, String skips) {
        this.plan = plan;
        this.price = price;
        this.skips = skips;
    }
}
