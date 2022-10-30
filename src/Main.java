public class Main {
    public static void main(String[] args) {
        System.out.println("Classes and Objects");


        System.out.println("Task 1");

        Author johnScalzi = new Author("John", "Scalzi");
        Book firstBook = new Book("Old Man's War", johnScalzi, 2005);
        System.out.println(firstBook.getBookName() + firstBook.getPublishingYear());
    }
}