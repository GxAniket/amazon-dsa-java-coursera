public class Update {
    public static void main(String[] args) {
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thur", "Friday", "Saturday", "Sunday" };

        days[3]= "Thursday"; // update the Array by index number 

        for (String day : days) {
            System.out.println(day);
        }
    }
}
