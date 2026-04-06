package org.skypro.skyshop.product;

public class SearchEngine {
    Searchable[] item;

    public SearchEngine(int searchSize) {
        this.item = new Searchable[searchSize];
    }

    public Searchable[] Search(String searchItem) {
        Searchable[] SearchResult = new Searchable[5];
        int k = 0;
        for (int i = 0; i < item.length; i++) {
            if (item[i] != null) {
                if ((item[i].searchTerm()).contains(searchItem)) {
                    SearchResult[k] = item[i];
                    k++;
                    if (k == 4) {
                        break;
                    }
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

    public Searchable SearchBest(String searchItem) {
        Searchable searchResult = null;
        int k = 0;
        int j = 0;
        for (int i = 0; i < item.length; i++) {
            if (item[i] != null) {
                if ((item[i].searchTerm()).contains(searchItem)) {
                    int count = 0;
                    int index = 0;
                    int indexOfSubstring = item[i].searchTerm().indexOf(searchItem, index);

                    while (indexOfSubstring != -1) {
                        count++;
                        index = indexOfSubstring + searchItem.length();
                        indexOfSubstring = item[i].searchTerm().indexOf(searchItem, index);
                    }
                    if (k < count) {
                        k = count;
                        j = i;
                    }
                }
            }
        }
        if (k > 0) {
            searchResult = item[j];
        } else {
            throw new BestResultNotFound(searchItem);
        }
        return searchResult;
    }


}
