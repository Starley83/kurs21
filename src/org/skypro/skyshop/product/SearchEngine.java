package org.skypro.skyshop.product;

public class SearchEngine {
 Searchable[] item;

       public SearchEngine(int searchSize ) {
       this.item = new Searchable[searchSize];
    }

    public Searchable[] Search (String searchItem) {
        Searchable [] SearchResult =  new Searchable[5];
        int k=0;
        for (int i=0; i<item.length; i++) {
            if (k==4) {
                break;
            }
            if (item[i] != null) {
                if((item[i].searchTerm()).contains(searchItem)) {
                    SearchResult[k]= item[i];
                    k++;
                }
            }

        }
        return SearchResult;
    }

    public void add(Searchable item2) {
        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                item[i] = item2;
                break;
            } else if (i == item.length - 1) {
                System.out.println("движок поиска переполнен");
            }
        }

    }


}
