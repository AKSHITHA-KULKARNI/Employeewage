import java.util.Random;

public class EmployeeAttendance {
    public boolean isEmployeePresent() {
        Random random = new Random();
        return random.nextInt(2) == 1; // 1: Present, 0: Absent
    }
}
