package org.skypro.skyshop.product;

public interface Searchable {
    String searchTerm();

    String searchContentType();

    String searchName();

    default String getStringRepresentation() {
        return "Названиеобъекта: " + searchName() + "тип объекта: " + searchContentType();
    }

}