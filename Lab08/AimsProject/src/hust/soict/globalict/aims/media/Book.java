package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Book extends Media implements Comparable<Object>{

	private String content;
    private List<String> authors = new ArrayList<String>();
    private List<String> contentTokens = new ArrayList<>();
	private Map<String, Integer> wordFrequency = new HashMap<>();
	
	public Book() {

    }

    public Book(String title) {
        super(title);
    }

    public Book(String title, String category) {
        super(title, category);
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);

    }

    public List<String> getAuthors() {
        return authors;
    }

    public Book(String title, String category, float cost, String id) {
        super(title, category, cost, id);
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        String tempString = authorName.toLowerCase();
        for (int i = 0; i < authors.size(); i++) {
            String temp = authors.get(i).toLowerCase();
            if (temp.equals(tempString)) {
                System.out.println("This author is in the list author");
                return;
            }
        }
        authors.add(authorName);
    }

    public void removeAuthor(String authorName) {
        int d = 0;
        String tempString = authorName.toLowerCase();
        for (int i = 0; i < authors.size(); i++) {
            String temp = authors.get(i).toLowerCase();
            if (temp.equals(tempString)) {
                System.out.println("This author is in the list of author");
                authors.remove(i);
                d++;
            }
        }
        if (d == 0) {
            System.out.println("This author isn't in the list od author");
        }

    }
    // show book
    public void showBook() {
        System.out.println("Book-" + this.getIdMedia() + "-" + this.getTitle() + "-" + this.getCost() + "-" + this.getCategory() + "-Author: " + this.getAuthors());
    }
    
    public void processContent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input content of the book");
        String temp = scanner.nextLine();
        content = temp.trim().replaceAll("\\s+", " ");
        String[] arrContent = content.split(" ");
        for (int i = 0; i < arrContent.length; i++) {
            contentTokens.add(arrContent[i]);
        }
        Collections.sort(contentTokens);
        for (String s : contentTokens) {
            Integer count = wordFrequency.get(s);
            if (count == null) {
                count = 0;
            }
            wordFrequency.put(s, count + 1);
        }
    }

    public void sortContentToken() {
        System.out.println("Content token after sort: ");
        for (int i = 0; i < contentTokens.size() - 1; i++) {
            System.out.print(contentTokens.get(i) + "-");
        }
        System.out.println(contentTokens.get(contentTokens.size() - 1));
        System.out.println(" ------------------------- ");
    }

    public void frequencyContent() {
        System.out.println("Frequency of each token:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println(" ------------------------- ");
    }
    
    @Override
    public int compareTo(Object obj) {
        if (obj instanceof Book) {
            Book aBook = (Book) obj;
            return this.getTitle().compareTo(aBook.getTitle());
        }
        return 0;
    }
}
