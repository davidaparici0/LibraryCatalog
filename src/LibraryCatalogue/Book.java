package LibraryCatalogue;

public class Book {

    // Properties
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; // Whether or not the book is checked out
    int dayCheckedOut;

    // Constructor
    public Book(String bookTitle, int bookPageCount, int bookISBN) {
       this.title = bookTitle;
       this.pageCount = bookPageCount;
       this.ISBN = bookISBN;
       isCheckedOut = false;
    }

    // Getters -- INSTANCE METHODS
    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }

    // Setters
    public void setIsCheckedOut(boolean newcheckedOut, int currentDayCheckedOut) {
        this.isCheckedOut = newcheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }

    private void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }
}
