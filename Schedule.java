import java.util.ArrayList;
import java.util.List;
public class Schedule {
    private List<InfoDisplay> infoItems;

    public Schedule() {
        infoItems = new ArrayList<>();
    }

    public void addInfoItem(InfoDisplay item) {
        infoItems.add(item);
    }

    public void displaySchedule() {
        System.out.println("Расписание занятий:");
        for (InfoDisplay item : infoItems) {
            item.displayInfo();
        }
    }
}
