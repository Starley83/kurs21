package org.skypro.skyshop.product;

public class BestResultNotFound extends IllegalArgumentException {
   private String Searchitem;

    public BestResultNotFound(String searchitem) {
        Searchitem = searchitem;
    }

    @Override
    public String toString() {
        return "не найден объект" + Searchitem;
    }
}
