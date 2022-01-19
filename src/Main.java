import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        String month = String.valueOf(currentDate.getMonth());
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("The current month is January");
                break;

            case "december":
                System.out.println("The current month is December");
                break;

            case "february":
                System.out.println("The current month is February");
                break;

            default:
                System.out.println("No month selected");
                break;
        }


        String dayOfTheWeek = String.valueOf(DayOfWeek.from(LocalDateTime.now()));
        switch (dayOfTheWeek.toLowerCase()) {
            case "sunday":
                System.out.println("Today is Sunday");
                break;

            case "monday":
                System.out.println("Today is Monday");
                break;

            case "tuesday":
                System.out.println("Today is Tuesday");
                break;

            case "wednesday":
                System.out.println("Today is Wednesday");
                break;

            case "thursday":
                System.out.println("Today is Thursday");
                break;

            case "friday":
                System.out.println("Today is Friday");
                break;

            case "saturday":
                System.out.println("Today is Saturday");
                break;

            default:
                System.out.println("Not a day of the week");
        }
    }
}
