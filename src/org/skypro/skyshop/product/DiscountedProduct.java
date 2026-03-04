package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private final int basePrice;
    private final int discount;


    public DiscountedProduct(String name, int price, int discount) {
        super(name);
        this.basePrice = price;
        this.discount = discount;

    }

    @Override
    public int getPrice() {
        return basePrice - basePrice * discount / 100;
    }

    @Override
    public String toString() {
        return "имя продукта: " + getName() + " стоимость " + getPrice() + " (скидка: " + discount + " )";
    }

    public boolean isSpecial() {
        return true;
    }
}
