public class Main {
    public static void main(String[] args) {
        System.out.println("Classes and Objects");


        System.out.println("Task 1");

        Author author = new Author("John", "Scalzi");
        Book firstBook = new Book("Old Man's War", author, 2005);
        System.out.println("Название книги = " + firstBook.getBookName() + " Автор = " + author.getFirstName() + " " + author.getSecondName() + " Год выпуска = " + firstBook.getPublishingYear());
        firstBook.setPublishingYear(2006);
        System.out.println(firstBook.getPublishingYear());

        Book secondBook = new Book("The Boys From Brazil", new Author("Ira", "Levin"), 1970);
        System.out.println("Название книги = " + secondBook.getBookName() + " Автор = " + secondBook.getAuthor() + " " + author.getSecondName() + " Год выпуска = " + secondBook.getPublishingYear());
    }
}