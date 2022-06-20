package hust.soict.globalict.aims.media;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Lev_Tolstoy");
        book.addAuthor("test1");
        book.addAuthor("test2");
        book.addAuthor("test3");
        book.printAuthors();
        book.removeAuthor("test2");
        book.printAuthors();
    }
}
