package hust.soict.globalict.test.media;

import hust.soict.globalict.aims.media.Book;

public class BookTest {

    public static void main(String[] args) {
        Book book = new Book("Let It Snow", "Comic", 20.5f);
        book.addAuthor("John Green");
        book.addAuthor("Maureen Johnson");
        book.addAuthor("Lauren Myracle");
        book.processContent();
        book.sortContentToken();
        book.frequencyContent();
        System.out.println(book.toString());
    }
}
