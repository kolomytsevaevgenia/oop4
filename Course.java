abstract class Course implements InfoDisplay {
    protected String firstName;
    protected String lastName;
    protected int courseNumber;

    public Course(String firstName, String lastName, int courseNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseNumber = courseNumber;
    }

    @Override
    public abstract void displayInfo();
}
