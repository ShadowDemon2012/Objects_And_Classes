public class Book {
    private String author;
    private int yearOfPublication;
    private String bookName;

    public Book(String bookName, int yearOfPublication, String author) {
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }


    public void setYearOfPublication(int yearOfPublication) {
        if (yearOfPublication < 1950 || yearOfPublication > 2050) {
            System.out.println("Invalid publishing year parameter: " + yearOfPublication);
            throw new RuntimeException("Вы вышли за пределы допустимых годов публикации");
        }
        this.yearOfPublication = yearOfPublication;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

}
