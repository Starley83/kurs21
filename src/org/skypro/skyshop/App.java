package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product[] market = new Product[5];
        ProductBasket Market = new ProductBasket("user1");


        Product product1 = new Product(100, "Машинка");
        Product product2 = new Product(70, "Мотоцикл");
        Product product3 = new Product(90, "Паравозик");
        Product product4 = new Product(110, "Кораблик");
        Product product5 = new Product(120, "Самолетик");
        Product product6 = new Product(80, "Трактор");

        System.out.println("проверка добавления в корзину продукта, проверка добавления шестого продукта");
        Market.addProduct(product1);
        Market.addProduct(product2);
        Market.addProduct(product3);
        //Market.addProduct(product4);
        Market.addProduct(product5);
        //Market.addProduct(product6);
        System.out.println("проверка вычисления стоимости корзины");
        System.out.println("стоимость продуктов в корзине = " + Market. calculateTotalPrice());

        System.out.println("проверка печати содержимого корзины");
        Market.contentsProductBasket();

        System.out.println("проверка поиска продукта в наличии " + product3);
        System.out.println("товар найден " + Market.checkProduct(product3));


        System.out.println("проверка поиска продукта отсутствие " + product6);
        System.out.println("товар найден " + Market.checkProduct(product6));

        System.out.println("очистка корзины");
        Market.clearProductBasket();
        Market.contentsProductBasket();
        System.out.println("стоимость продуктов в корзине = " + Market. calculateTotalPrice());
        System.out.println("товар найден " + Market.checkProduct(product2));


    }
}