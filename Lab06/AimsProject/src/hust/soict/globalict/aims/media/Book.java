package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();
	
	public Book(String title) {
        super(title);
    }

    public Book(String title, String category) {
        super(title, category);
    }

    public Book(String title, String category, ArrayList<String> authors) {
        super(title, category);
        this.authors = authors;
    }

	public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        boolean authorExist = false;
        for (String author : authors) {
            if (author.equals(authorName)) {
                authorExist = true;
                break;
            }
        }
        if (!authorExist) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        boolean authorExist = false;
        for (String author : authors) {
            if (author.equals(authorName)) {
                authorExist = true;
                break;
            }
        }
        if (authorExist) {
            authors.remove(authorName);
        }
    }

    public void printAuthors() {
        for (String author : authors) {
            System.out.println(author);
        }
    }
}