package com.citb408.goods;

public class TaxiDriver extends RegisterProvider {

    private double pricerPerKm;
    private double totalKm;

    public TaxiDriver(String type, String registerNumber, double pricerPerKm, double totalKm) {
        super(type, registerNumber);
        this.pricerPerKm = pricerPerKm;
        this.totalKm = totalKm;
    }

    @Override
    public double calculateIncome() {
        return this.pricerPerKm * this.totalKm;
    }

    @Override
    public String toString() {
        return "TaxiDriver{" +
                "pricerPerKm=" + pricerPerKm +
                ", totalKm=" + totalKm +
                "} " + super.toString();
    }
}
