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
        return getFirstName() + " " + getSecondName();
    }

    @Override
    public boolean equals(Object ob) {
        if (this.getClass() != ob.getClass()) {
            return false;
        }
        Author thirdBook = (Author) ob;
        return secondName.equals(thirdBook.secondName);
    }
}
