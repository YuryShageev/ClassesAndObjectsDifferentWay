public class Main {
    public static void main(String[] args) {
        System.out.println("Classes and Objects");


        System.out.println("Task 1");

        Author johnScalzi = new Author("John", "Scalzi");
        Book firstBook = new Book("Old Man's War", johnScalzi, 2005);
        System.out.println("Название книги = " + firstBook.getBookName() + " Автор = " + johnScalzi + " Год выпуска = " + firstBook.getPublishingYear());

        firstBook.setPublishingYear(2006);
        System.out.println(firstBook.getPublishingYear());
    }
}