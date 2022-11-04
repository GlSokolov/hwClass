import javax.naming.Name;
import java.util.Objects;
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

    @Override
    public String toString() {
        return "Название книги - "+bookName+ ", "+authorName.toString()+", Дата публикации - "+publicationYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName,authorName,publicationYear);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != getClass()) return false;
        Book book1 = (Book) obj;
        return bookName.equals(book1.bookName) && authorName.equals(book1.authorName) && publicationYear == book1.publicationYear;
    }
}
