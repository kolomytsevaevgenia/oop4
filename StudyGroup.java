public class StudyGroup extends Group {

    public StudyGroup(String groupNumber, String dayOfWeek, String type) {
        super(groupNumber, dayOfWeek, type);
    }

    @Override
    public void displayInfo() {
        System.out.println("Группа: " + groupNumber + ", День: " + dayOfWeek + ", Тип: " + type);
        System.out.println("Предметы:");
        for (String subject : subjects) {
            System.out.println("- " + subject);
        }
    }
}



