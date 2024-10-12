import java.util.ArrayList;
import java.util.List;
abstract class Group implements InfoDisplay {
    protected String groupNumber;
    protected String dayOfWeek;
    protected String type; // числитель или знаменатель
    protected List<String> subjects;

    public Group(String groupNumber, String dayOfWeek, String type) {
        this.groupNumber = groupNumber;
        this.dayOfWeek = dayOfWeek;
        this.type = type;
        this.subjects = new ArrayList<>();
    }

    @Override
    public abstract void displayInfo();

    public void addSubject(String subject) {
        subjects.add(subject);
    }
}

