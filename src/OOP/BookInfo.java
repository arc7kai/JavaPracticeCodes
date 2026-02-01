package OOP;
// Note:- In this code I learn about encapsulation and use of constructors also toString method overriding
public class BookInfo {
    private String bookTitle;
    private String bookAuthor;
    private double bookPrice;

    public BookInfo(String bookTitle, String bookAuthor, double bookPrice) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book Title: " + bookTitle +
                ", Author: " + bookAuthor +
                ", Price: " + bookPrice;
    }

    public static void main(String[] args) {
        BookInfo obj1 = new BookInfo("book1", "author1", 100);
        BookInfo obj2 = new BookInfo("book2", "author2", 200);

        System.out.println("contained Books:");
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
