package org.skypro.skyshop.product;

import java.util.Objects;

public abstract class Product {
    private final String name;


    public Product(String name) {
                this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getPrice();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return  Objects.equals(name, product.name);
    }

    @Override
    public abstract String toString();

    public abstract boolean isSpecial();
}
