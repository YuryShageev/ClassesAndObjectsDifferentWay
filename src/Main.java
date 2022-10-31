public class Main {
    public static void main(String[] args) {
        System.out.println("Classes and Objects");


        System.out.println("Task 1");

//        Author author = new Author("John", "Scalzi");
        Book firstBook = new Book("Old Man's War", new Author("John", "Scalzi"), 2005);
        System.out.println("Название книги = " + firstBook.getBookName() + " Автор = " + firstBook.getAuthor() + " Год выпуска = " + firstBook.getPublishingYear());
        firstBook.setPublishingYear(2006);
        System.out.println(firstBook.getPublishingYear());

        Book secondBook = new Book("The Boys From Brazil", new Author("Ira", "Levin"), 1970);
        System.out.println("Название книги = " + secondBook.getBookName() + " Автор = " + secondBook.getAuthor() + " Год выпуска = " + secondBook.getPublishingYear());

        Book thirdBook = new Book("Old Man's War", new Author("John", "Scalzi"), 2005);
        System.out.println("Название книги = " + thirdBook.getBookName() + " Автор = " + thirdBook.getAuthor() + " Год выпуска = " + thirdBook.getPublishingYear());

//        Author author3 = new Author("John", "Scalzi");
//        System.out.println(author3.equals(author));

        System.out.println(thirdBook.equals(firstBook));
    }
}