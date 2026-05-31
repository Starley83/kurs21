package org.skypro.skyshop.product;

import java.util.LinkedList;
import java.util.List;

public class SearchEngine {
    private List<Searchable> item;

    public SearchEngine() {
        this.item = new LinkedList<>();
        ;
    }

    public List<Searchable> Search(String searchItem) {
        List<Searchable> SearchResult = new LinkedList<>();
        for (int i = 0; i < item.size(); i++) {
            if (item.get(i) != null) {
                if ((item.get(i).searchTerm()).contains(searchItem)) {
                    SearchResult.add(item.get(i));
                }
            }

        }
        return SearchResult;
    }

    public void add(Searchable item2) {
        {
            item.add(item2);
        }

    }

    public Searchable SearchBest(String searchItem) throws BestResultNotFound {
        Searchable searchResult = null;
        int k = 0;
        int j = 0;
        for (int i = 0; i < item.size(); i++) {
            if (item.get(i) != null) {
                if ((item.get(i).searchTerm()).contains(searchItem)) {
                    int count = 0;
                    int index = 0;
                    int indexOfSubstring = item.get(i).searchTerm().indexOf(searchItem, index);

                    while (indexOfSubstring != -1) {
                        count++;
                        index = indexOfSubstring + searchItem.length();
                        indexOfSubstring = item.get(i).searchTerm().indexOf(searchItem, index);
                    }
                    if (k < count) {
                        k = count;
                        j = i;
                    }
                }
            }
        }
        if (k > 0) {
            searchResult = item.get(j);
        }
        if (searchResult == null) {
            throw new BestResultNotFound(searchItem);
        }
        return searchResult;
    }
}
