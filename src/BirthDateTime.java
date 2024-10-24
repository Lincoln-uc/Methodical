import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get the year of birth
        int year = SafeInput.getRangedInt(in, "Enter your year of birth", 1950, 2015);

        // Get the month of birth
        int month = SafeInput.getRangedInt(in, "Enter your month of birth", 1, 12);

        // Determine the maximum days in the month
        int maxDays;
        switch (month) {
            case 2: // February
                maxDays = 29;
                break;
            case 4: case 6: case 9: case 11: // April, June, September, November
                maxDays = 30;
                break;
            default:
                maxDays = 31;
        }

        // Get the day of birth
        int day = SafeInput.getRangedInt(in, "Enter your day of birth", 1, maxDays);

        // Get the hour of birth
        int hour = SafeInput.getRangedInt(in, "Enter the hour of your birth", 1, 24);

        // Get the minute of birth
        int minute = SafeInput.getRangedInt(in, "Enter the minute of your birth", 1, 59);

        // Display the complete birth, date and time
        System.out.printf("You were born on %d/%d/%d at %02d:%02d%n", month, day, year, hour, minute);
    }
}
