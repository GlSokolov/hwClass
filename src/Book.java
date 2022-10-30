import javax.naming.Name;

public class Book {
    private final String bookName;
    private final Author authorName;
    private int publicationYear;
    public Book (String book, Author author, int publication) {
        this.bookName = book;
        this.authorName = author;
        this.publicationYear = publication;
    }

    public String getBookName() {
        return this.bookName;
    }
    public Author getAuthorName() {
        return this.authorName;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
