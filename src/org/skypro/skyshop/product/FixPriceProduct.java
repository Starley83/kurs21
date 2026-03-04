package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private static final int FIXED_PRICE = 79;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public int getPrice() {
        return FIXED_PRICE;
    }

    @Override
    public String toString() {
        return "имя продукта: " + getName() + " фиксированная цена " + FIXED_PRICE;
    }

    public boolean isSpecial() {
        return true;
    }
}
