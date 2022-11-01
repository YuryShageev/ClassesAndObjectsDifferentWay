import java.util.Objects;

public class Author {
    private final String firstName;
    private final String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public String toString() {
        return firstName + " " + secondName;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return false;
        if (ob == null || getClass() != ob.getClass())
            return false;
        Author author = (Author) ob;
        return Objects.equals(firstName, author.firstName) && Objects.equals(secondName, author.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }

}
