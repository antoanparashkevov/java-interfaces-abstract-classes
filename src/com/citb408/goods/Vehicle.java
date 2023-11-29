package com.citb408.goods;

public class Vehicle extends Goods {
    private double materialExpenses;
    private double salaryExpenses;

    public Vehicle(double overcharge, double materialExpenses, double salaryExpenses) {
        super(overcharge);
        this.materialExpenses = materialExpenses;
        this.salaryExpenses = salaryExpenses;
    }

    public double getMaterialExpenses() {
        return materialExpenses;
    }

    public double getSalaryExpenses() {
        return salaryExpenses;
    }

    @Override
    public double productionPrice() {
        return this.materialExpenses + this.salaryExpenses;
    }
}
