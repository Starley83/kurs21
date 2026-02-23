package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {
    private String customer;
    private Product[] products;

    public ProductBasket(String customer) {
        this.customer = customer;
        this.products = new Product[5];
    }

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            } else if (i == 4) {
                System.out.println("Невозможно добавить продукт");
            }
        }

    }

    public int priceProductBasket() {
        int basketPrice = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                basketPrice = basketPrice + 0;
            } else {
                basketPrice = basketPrice + products[i].getPrice();
            }
        }
        return basketPrice;
    }

    public void contentsProductBasket() {
        int j = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                j = j + 1;
            } else {
                System.out.println(products[i].toString());
            }

        }
        if (j == 5) {
            System.out.println("в корзине пусто");
        } else {
            System.out.println("общая стоимость корзины: " + priceProductBasket());
        }
    }


    public boolean checkProduct(Product product1) {
        boolean check = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                continue;
            } else {
                if (products[i].equals(product1)) {
                    check = true;
                    break;
                }
            }

        }
        return check;
    }

        public void clearProductBasket () {
            for (int i = 0; i < products.length; i++) {
                products[i] = null;
            }
        }
    }
