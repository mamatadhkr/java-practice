public class LibraryStudent implements LibraryHelper {
    // method for borrowed books
    public void showBorrowedBooks() {
        System.out.println("Borrowed Books:");
        System.out.println("1. Java Programming");
        System.out.println("2. DBMS");
    }
    // method for course books
    public void showCourseBooks(String course) {
        System.out.println("\nBooks for " + course + " course:");
        if(course.equals("Computer Engineering")) {
            System.out.println("1. C Programming");
            System.out.println("2. Java");
            System.out.println("3. DBMS");
        }

        else {
            System.out.println("No books available.");  } }// main method
    public static void main(String[] args) {
        LibraryStudent s = new LibraryStudent();
        s.showBorrowedBooks();
        s.showCourseBooks("Computer Engineering"); }}
