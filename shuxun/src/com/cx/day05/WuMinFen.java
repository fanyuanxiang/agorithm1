package com.cx.day05;

public class WuMinFen {
    String theMa ;
    int  quantity;
    boolean likeSoup;

    public WuMinFen(String theMa, int quantity, boolean likeSoup) {
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
    }

    public WuMinFen(String theMa, int quantity) {
        this.theMa=theMa;
        this.quantity=quantity;
        this.likeSoup=false;
    }

    @Override
    public String toString() {
        return "WuMinFen{" +
                "theMa='" + theMa + '\'' +
                ", quantity=" + quantity +
                ", likeSoup=" + likeSoup +
                '}';
    }
}
