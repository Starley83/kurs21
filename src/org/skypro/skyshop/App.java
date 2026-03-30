package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;

import javax.naming.directory.SearchResult;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ProductBasket Market = new ProductBasket("user1");
        SearchEngine piece = new SearchEngine(9);


        Product product1 = new SimpleProduct("Машинка", 100);
        Product product2 = new DiscountedProduct("Мотоцикл", 70, 10);
        Product product3 = new SimpleProduct("Паравозик", 90);
        Product product4 = new FixPriceProduct("Кораблик");
        Product product5 = new DiscountedProduct("Самолетик", 120, 10);
        Product product6 = new SimpleProduct("Трактор", 80);

        Article article1 = new Article("BMW", "Машинка - Модель BMW 5й серии");
        Article article2 = new Article("F-16", "Самолет четвертого поколения");
        Article article3 = new Article("Корабль", "Титаник- самый быстрый пароход в атлантике");



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

        System.out.println(article1.toString());
        System.out.println(article2.toString());
        System.out.println(article3.toString());

        System.out.println("проверка работы поиска");
        piece.add(product1);
        piece.add(product2);
        piece.add(product3);
        piece.add(product4);
        piece.add(product5);
        piece.add(product6);
        piece.add(article1);
        piece.add(article2);
        piece.add(article3);
        System.out.println(Arrays.toString(piece.Search ("Машинка")));
        System.out.println(Arrays.toString(piece.Search ("пароход")));
        System.out.println(Arrays.toString(piece.Search ("Мотоцикл")));




    }
}