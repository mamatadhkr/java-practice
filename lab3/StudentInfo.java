class StudentInfo {

    String name;
    int roll;

    // constructor
    StudentInfo(String n, int r) {
        name = n;
        roll = r;
    }
    // method to display info
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}
