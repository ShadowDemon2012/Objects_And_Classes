public class Main {
    public static void main(String[] args) {
        Author authorOfFirstBook = new Author("Лев", "Толстой");
        Author levTolstoy = new Author("Лев", "Толстой");
        Book firstBook = new Book("Война и мир", 1963, authorOfFirstBook);
        Book firstBookDuplicate = new Book("Война и мир", 1983, authorOfFirstBook);
        Author authorOfSecondBook = new Author("Фёдор", "Достоевский");
        Book secondBook = new Book("Преступление и наказание", 1974, authorOfSecondBook);
        Author newAuthor = new Author("Александр", "Грибоедов");
        Book newBook = new Book("Горе от ума", 2006, newAuthor);
        Book[] catalog = new Book[5];
        catalog[0] = firstBook;
        catalog[2] = secondBook;
        firstBook.setYearOfPublication(1983);
        secondBook.setYearOfPublication(2000);
        System.out.println(firstBook.equals(firstBookDuplicate));
        System.out.println(firstBook.hashCode()==firstBookDuplicate.hashCode());
        System.out.println(firstBook.hashCode());
        System.out.println(firstBookDuplicate.hashCode());
        printingAllBooks(catalog,newBook);
    }



    public static void printingAllBooks(Book[] catalog, Book newBook) {
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
