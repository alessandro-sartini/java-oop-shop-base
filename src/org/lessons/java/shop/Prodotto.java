package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    private int productCode;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal iva;

    public Prodotto(String name, String description, BigDecimal price, BigDecimal iva) {
        Random rand = new Random();
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
        this.productCode = rand.nextInt(1000);
    }

    public Prodotto(String name, BigDecimal price, BigDecimal iva) {
        Random rand = new Random();
        this.name = name;
        this.price = price;
        this.iva = iva;
        this.productCode = rand.nextInt(1000);
    }

    public int getCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setName(BigDecimal newPrice){
        this.price=newPrice;
    }

    public String getDescription() {
        return description;
    }
    

    public void setDescription(String description){
        this.description=description;
    }

    public BigDecimal getBasePrice() {
        return this.price;
    }

    public BigDecimal getIvaPrice() {
        if (price != null && iva != null) {
            return price.add(price.multiply(iva).setScale(2, RoundingMode.DOWN));
        }
        return null;
    }

    public String extendedName() {
        String fullName = productCode + "-" + name;
        return fullName;
    }

}