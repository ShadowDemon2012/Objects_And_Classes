public class Main {
    public static void main(String[] args) {
        Author authorOfFirstBook = new Author("Лев", "Толстой");
        Book firstBook = new Book("Война и мир", 1963, authorOfFirstBook.getFirstName() + " " + authorOfFirstBook.getLastName());
        Author authorOfSecondBook = new Author("Фёдор", "Достоевский");
        Book secondBook = new Book("Преступление и наказание", 1974, authorOfSecondBook.getFirstName() + " " + authorOfSecondBook.getLastName());
        Author newAuthor = new Author("Александр", "Грибоедов");
        Book newBook = new Book("Горе от ума", 2006, newAuthor.getFirstName() + " " + newAuthor.getLastName());
        firstBook.setYearOfPublication(1983);
        secondBook.setYearOfPublication(2000);
        printingAllBooks(firstBook, secondBook, newBook);
    }

    public static void printingAllBooks(Book firstBook, Book secondBook, Book newBook) {
        Book[] catalog = new Book[5];
        catalog[0] = firstBook;
        catalog[2] = secondBook;
        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i] != null) {
                System.out.println("\"" + catalog[i].getAuthor() + ": " + catalog[i].getBookName() + ": " + catalog[i].getYearOfPublication() + "\"");
            } else {
                catalog[i] = newBook;
                System.out.println("\"" + catalog[i].getAuthor() + ": " + catalog[i].getBookName() + ": " + catalog[i].getYearOfPublication() + "\"");
            }
        }
    }
}
