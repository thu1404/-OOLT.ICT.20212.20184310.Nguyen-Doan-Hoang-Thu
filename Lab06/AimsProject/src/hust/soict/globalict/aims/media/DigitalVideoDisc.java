package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Media {
    private String directory;
    private int length;

    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category) {
        super(title, category);
    }

    public DigitalVideoDisc(String title, String category, String directory) {
        super(title, category);
        this.directory = directory;
    }

    public DigitalVideoDisc(String title, String category, String directory, int length) {
        super(title, category);
        this.directory = directory;
        this.length = length;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }


    public void setLength(int length) {
        this.length = length;
    }

    public boolean search(String title) {
        String discName = this.getTitle();
        String[] discNameArray = discName.split(" ");
        String[] titleArray = title.split(" ");

        boolean tokenExist = false;

        for (String a : titleArray) {
            for (String b : discNameArray) {
                if (a.equals(b)) {
                    tokenExist = true;
                }
            }
            if (tokenExist == false) {
                return false;
            }
        }
        return true;
    }
}
