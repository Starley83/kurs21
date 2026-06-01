package org.skypro.skyshop.product;

public class BestResultNotFound extends Exception {
    private String SearchItem;

    public BestResultNotFound(String searchItem) {
        SearchItem = searchItem;
    }

    @Override
    public String toString() {
        return "для запроса " + SearchItem + " не нашлось подходящего результата";
    }
}
