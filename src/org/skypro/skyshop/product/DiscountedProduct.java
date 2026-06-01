package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private final int basePrice;
    private final int discount;


    public DiscountedProduct(String name, int price, int discount) {
        super(name);
        if (price <= 0) {
            throw new IllegalArgumentException("цена продукта <=0");
        }
        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException("скидка меньше 0 или больше 100");
        }
        this.basePrice = price;
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        return basePrice - basePrice * discount / 100;
    }

    @Override
    public String toString() {
        return "имя продукта: " + getName() + " стоимость " + getPrice() + " (скидка: " + discount + " )" + '\n';
    }

    public boolean isSpecial() {
        return true;
    }
}
