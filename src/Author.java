import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;

    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        return "Автор - " +name+ " " +surname;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name,surname);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author1 = (Author) obj;
        return name.equals(author1.name) && surname.equals(author1.surname);
    }
}
