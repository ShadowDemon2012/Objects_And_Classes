import java.util.Objects;

public class Book {
    private final Author author;
    private int yearOfPublication;
    private final String bookName;

    public Book(String bookName, int yearOfPublication, Author author) {
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }


    public void setYearOfPublication(int yearOfPublication) {
        if (yearOfPublication < 1950 || yearOfPublication > 2050) {
            System.out.println("Invalid publishing year parameter: " + yearOfPublication);
            throw new RuntimeException("Вы вышли за пределы допустимых годов публикации");
        }
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Книга " + bookName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && author.equals(book.author) && bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, yearOfPublication, bookName);
    }
}
