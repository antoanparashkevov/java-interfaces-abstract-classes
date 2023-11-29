package com.citb408.goods;

public abstract class Goods implements CanBeSold {
    private double overcharge;//should be percentage

    public Goods(double overcharge) {
        this.overcharge = overcharge;
    }

    @Override
    public double sellingPrice() {
        //can work with abstract methods that come from interface and aren't implemented yet
        return this.productionPrice() + ((this.productionPrice() * this.overcharge) / 100);
    }
}
