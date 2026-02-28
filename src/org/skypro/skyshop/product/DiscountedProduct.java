package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private final int price;
    private final int discount;


    public DiscountedProduct(String name, int price, int discount) {
        super(name);
        this.price = price - price * discount / 100;
        ;
        this.discount = discount;

    }

    @Override
    public int getPrice() {

        return price;
    }

    @Override
    public String toString() {
        return "имя продукта: " + getName() + " стоимость " + getPrice() + " (скидка: " + discount + " )";
    }

    public boolean isSpecial() {
        return true;
    }
}
