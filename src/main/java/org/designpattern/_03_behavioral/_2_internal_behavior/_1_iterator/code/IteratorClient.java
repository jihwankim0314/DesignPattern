package org.designpattern._03_behavioral._2_internal_behavior._1_iterator.code;

public class IteratorClient {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        // 도서 추가
        collection.addBook("Design Patterns");
        collection.addBook("Clean Code");
        collection.addBook("Effective Java");

        // Iterator를 사용해 도서 순회
        Iterator<String> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
