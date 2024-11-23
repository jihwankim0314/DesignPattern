package org.designpattern._03_behavioral._2_internal_behavior._1_iterator.code;

import java.util.ArrayList;
import java.util.List;

public class BookCollection<T> implements Aggregate<String> {
    private List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public Iterator<String> createIterator() {
        return new BookIterator();
    }

    private class BookIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public String next() {
            if (hasNext()) {
                return books.get(index);
            }

            return null;
        }
    }
}
