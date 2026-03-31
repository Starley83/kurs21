package org.skypro.skyshop.product;

public class Article implements Searchable{
    private final String article;
    private final String articleText;

    public Article(String article, String articleText) {
        this.article = article;
        this.articleText = articleText;
    }

    @Override
    public String toString() {
        return "Статья: " + article +'\n'+
                "Содержание:" + articleText;
    }
    @Override
    public String searchTerm() {
        return toString();
    }
    @Override
    public String searchContentType() {
        return "ARTICLE";
    }

    @Override
    public String searchName() {
        return this.article;
    }

}
