import java.util.Scanner;

public class SwitchDay {
    public static void main(String[] args) {
        int day = 3;
        System.out.println("Enter the index of the day today:");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println("The day is: " + dayName);

    }
}
