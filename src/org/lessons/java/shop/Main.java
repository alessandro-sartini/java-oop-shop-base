package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
     public static void main(String[] args) {


        Prodotto p1 = new Prodotto("scarpa",
         "scarpa molto confortevole", 
         new BigDecimal(100), 
         new BigDecimal(0.22)
        );

        System.out.println("prezzo dell'articolo base: "+p1.getBasePrice());
        System.out.println("prezzo dell'articolo con iva: "+p1.getIvaPrice());
        System.out.println("prezzo dell'articolo con iva: "+p1.extendedName());


        // System.out.println(p1.productCode);
        System.out.println(p1.getCode());
    }
}
