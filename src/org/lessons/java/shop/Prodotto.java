package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    int productCode;
    String name;
    String description;
    float price;
    int iva = 22;

    Random ran= new Random();

    Prodotto(String name,String description,float price){
        this.name=name;
        this.description=description;
        this.price=price;
        this.productCode=ran.nextInt(1000);
    }
    void priceWithIva(){
        float priceIva=price * iva / 100 + price;
        System.out.println("il prezzo comprensivo di iva e` "+ priceIva);
    }
    String extendedName(){
        String fullName= name+"-"+productCode;
        return fullName;
    }
}
