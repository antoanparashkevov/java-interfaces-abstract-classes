package com.citb408.goods;

public class Engineer implements Provider {

    private double hourlyWage;
    private double hoursWorked;

    public Engineer(double hourlyWage, double hoursWorked) {
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateIncome() {
        return this.hourlyWage * this.hoursWorked;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "hourlyWage=" + hourlyWage +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
