public class Book {
    private String bookName;
    private String authorName;
    private int publicationYear;
    public Book (String book, String author, int publication) {
        this.bookName = book;
        this.authorName = author;
        this.publicationYear = publication;
    }

    public String getBookName() {
        return this.bookName;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
