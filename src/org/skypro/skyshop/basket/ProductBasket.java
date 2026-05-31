package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ProductBasket {
    private String customer;
    private List<Product> products;

    public ProductBasket(String customer) {
        this.customer = customer;
        this.products = new LinkedList<>();
    }

    public void addProduct(Product product) {
        {
            if (product != null) {
                this.products.add(product);
            } else {
                System.out.println("Невозможно добавить продукт");
            }
        }

    }

    public int calculateTotalPrice() {
        int basketPrice = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) != null) {
                basketPrice = basketPrice + products.get(i).getPrice();
            }
        }
        return basketPrice;
    }

    public void contentsProductBasket() {
        int countSpesial = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) != null) {
                System.out.println(products.get(i).toString());
                if (products.get(i).isSpecial()) {
                    countSpesial++;
                }

            }
            if (products.isEmpty()) {
                System.out.println("В корзине пусто");
            } else {
                System.out.println("общая стоимость корзины: " + calculateTotalPrice());
                System.out.println("Специальных товаров: " + countSpesial);
            }
        }
    }


    public boolean checkProduct(Product product1) {
        boolean check = false;
        Iterator<Product> iterator = products.iterator();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).equals(product1)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public void clearProductBasket() {
        {
            products.clear();
        }
    }

    public List<Product> deleteProduct(String name1) {
        Iterator<Product> iterator = products.iterator();
        List<Product> Products1 = new LinkedList<>();
        int i = 0;
        while (iterator.hasNext()) {
            if (name1.equals(iterator.next().getName())) {
                Products1.add(products.get(i));
                iterator.remove();
            }
            ;
            i++;
        }

        if (Products1.isEmpty()) {
            System.out.println("список пуст");
        } else {
            System.out.println("список удаленных продуктов" + Products1.toString());
        }
        System.out.println(products.toString());
        return Products1;
    }

}
