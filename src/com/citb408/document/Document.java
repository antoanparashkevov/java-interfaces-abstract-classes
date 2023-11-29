package com.citb408.document;

public class Document extends ObjectWithSize implements Printable {
    private int pages;

    public Document(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override//this tells that the method comes from the com.citb408.document.Printable interface
    public void print() {
        for (int i = 1; i <= pages; i++) {
            System.out.println("Printed " + i);
        }
    }

    @Override
    public void resize() {

    }
}
