package com.citb408;

import com.citb408.document.Document;
import com.citb408.document.Printable;
import com.citb408.goods.*;

public class Main {
    public static void main(String[] args) {

//        Printable printableRef;
//
//        Document document = new Document(10);
//
//        document.print();
//
//        printableRef = document;
//
//        printableRef.print();

//        printableRef.getPages();//don't have methods that are not from the interface

        Provider provider;

        RegisterProvider registerProvider;

        CanBeSold canBeSold;
        Goods goods;

        Vehicle vehicle = new Vehicle(10, 3000, 2000);
        System.out.println(vehicle.productionPrice());
        System.out.println(vehicle.sellingPrice());
        System.out.println(vehicle.getMaterialExpenses());
        System.out.println(vehicle.getSalaryExpenses());

        canBeSold = vehicle;

        //can't see the getters from the Vehicle class
        System.out.println(canBeSold.productionPrice());
        System.out.println(canBeSold.sellingPrice());

        goods = vehicle;

        //can't see the getters from the Vehicle class
        System.out.println(goods.sellingPrice());
        System.out.println(goods.productionPrice());

        Engineer engineer = new Engineer(120, 40);

        TaxiDriver taxiDriver = new TaxiDriver("Person", "A32", 3, 400);

        provider = engineer;

        System.out.println(provider.calculateIncome());

        provider = taxiDriver;

        System.out.println(provider.calculateIncome());

    }
}