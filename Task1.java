// Create a student class to simulate a student's profile. The class should have the following
// attributes: student ID, name and GPA. Include method to updateGPA() and printProfile().
/// Inplement functionality to create new student profiles, updates GPA and print student
// profiles.

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Student sushant = new Student(1022, 2.32, "Sushant Babu Prasai.");
        sushant.printProfile();
        sushant.updateGPA(3.44);
        sushant.printProfile();

    }
}

class Student {
    int student_id;
    String studentName;
    double GPA;

    Student(int student_id, double GPA, String studentName) {
        this.student_id = student_id;
        this.studentName = studentName;
        this.GPA = GPA;
    }

    public double updateGPA(double GPA) {
        System.out.println("Updated GPA: " + GPA);
        return this.GPA = GPA;
    }

    public void printProfile() {
        System.out.println("Name:" + studentName + " GPA : " + GPA);
    }

}