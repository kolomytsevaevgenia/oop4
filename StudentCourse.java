public class StudentCourse extends Course {

    public StudentCourse(String firstName, String lastName, int courseNumber) {
        super(firstName, lastName, courseNumber);
    }

    @Override
    public void displayInfo() {
        System.out.println("Студент: " + firstName + " " + lastName + ", Курс: " + courseNumber);
    }
}
