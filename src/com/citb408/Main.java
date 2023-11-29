package com.citb408;

import com.citb408.document.Document;
import com.citb408.document.Printable;
import com.citb408.goods.Provider;
import com.citb408.goods.RegisterProvider;

public class Main {
    public static void main(String[] args) {

        Printable printableRef;

        Document document = new Document(10);

        document.print();

        printableRef = document;

        printableRef.print();

        //printableRef.getPages();//don't have methods that are not from the interface

        Provider provider;

        RegisterProvider registerProvider;

    }
}