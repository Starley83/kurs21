package org.skypro.skyshop.product;

import java.util.Objects;

public class Product {
    private String name;
    private int price;

    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public String toString() {
        return "<Имя продукта>: " + name + " <стоимость> " + price;
    }
}
