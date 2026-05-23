abstract class Student {

    String name;
    int roll;
    Student(String n, int r) {
        name = n;
        roll = r;
    }
    // normal method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);}

    void attendClass() {

        System.out.println(name + " is attending class.");
    }
    void payFee() {
        System.out.println(name + " paid fee.");
    }
    // abstract method
    abstract void giveExam();
}