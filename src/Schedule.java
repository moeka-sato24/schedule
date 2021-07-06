import java.util.ArrayList;
import java.util.List;

public class Schedule {
    List<String> scheduleListAM = new ArrayList<>(31);
    List<String> scheduleListPM = new ArrayList<>(31);

    public Schedule() {
    }

    public void setScheduleListAM(List<String> scheduleListAM) {
        this.scheduleListAM = scheduleListAM;
    }

    public void setScheduleListPM(List<String> scheduleListPM) {
        this.scheduleListPM = scheduleListPM;
    }


}
