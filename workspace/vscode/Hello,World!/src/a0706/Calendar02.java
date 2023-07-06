import java.util.Calendar;

public class Calendar02 {
    public static void main(String[] args) {
        Calendar Calendar = java.util.Calendar.getInstance();
        
        int year = Calendar.get(Calendar.YEAR);
        int month = Calendar.get(Calendar.MONTH) + 1; // 월은 0부터 시작하므로 1을 더해줌.
        int day = Calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Current Date: " + year + "-" + month + "-" + day);
    }
}
