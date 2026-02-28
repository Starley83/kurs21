package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        ProductBasket Market = new ProductBasket("user1");


        Product product1 = new SimpleProduct("Машинка", 100);
        Product product2 = new DiscountedProduct("Мотоцикл", 70, 10);
        Product product3 = new SimpleProduct("Паравозик", 90);
        Product product4 = new FixPriceProduct("Кораблик");
        Product product5 = new DiscountedProduct("Самолетик", 120, 10);
        Product product6 = new SimpleProduct("Трактор", 80);

        System.out.println("проверка добавления в корзину продукта, проверка добавления шестого продукта");
        Market.addProduct(product1);
        Market.addProduct(product2);
        Market.addProduct(product3);
        Market.addProduct(product4);
        Market.addProduct(product5);
        Market.addProduct(product6);
        System.out.println("проверка вычисления стоимости корзины");
        System.out.println("стоимость продуктов в корзине = " + Market.calculateTotalPrice());

        System.out.println("проверка печати содержимого корзины");
        Market.contentsProductBasket();

        System.out.println("проверка поиска продукта в наличии " + product3);
        System.out.println("товар найден " + Market.checkProduct(product3));


        System.out.println("проверка поиска продукта отсутствие " + product6);
        System.out.println("товар найден " + Market.checkProduct(product6));

        System.out.println("очистка корзины");
        Market.clearProductBasket();
        Market.contentsProductBasket();
        System.out.println("стоимость продуктов в корзине = " + Market.calculateTotalPrice());
        System.out.println("товар найден " + Market.checkProduct(product2));


    }
}