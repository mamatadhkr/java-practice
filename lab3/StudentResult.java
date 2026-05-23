public class StudentResult extends StudentInfo implements LibraryRules {
    int marks;
    // constructor
    StudentResult(String n, int r, int m) {
        super(n, r);
        marks = m;
    }
    // interface method
    public void borrowedBooks() {
        System.out.println("Borrowed Books:");
        System.out.println("1. Java");
        System.out.println("2. DBMS");}
    // normal method
    void displayMarks() {
        System.out.println("Student Marks: " + marks);}
    // main method
    public static void main(String[] args) {

        StudentResult s = new StudentResult("Mamata", 12, 85);
        s.displayInfo();
        s.displayMarks();
        s.borrowedBooks();}}