public class StudentCEIV extends Student {
    // constructor
    StudentCEIV(String n, int r) {
        super(n, r);
    }
    // abstract method body
    void giveExam() {
        System.out.println(name + " is giving exam.");
    }
    // main method
    public static void main(String[] args) {
        StudentCEIV s = new StudentCEIV("Mamata", 12);
        s.displayInfo();
        s.attendClass();
        s.payFee();
        s.giveExam();
}
}