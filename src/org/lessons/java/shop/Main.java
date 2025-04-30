package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Prodotto p1= new Prodotto("scarpa", "scarpa molto confortevole", 100.99f);
        System.out.println(p1.price);
        System.out.println(p1.productCode);
        p1.priceWithIva();
        System.out.println(p1.extendedName());
    }
}
