import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get a SSN from the user using the pattern ^\\d{3}-\\d{2}-\\d{4}$
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (format: xxx-xx-xxxx)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN is: " + ssn);

        // Get a UC Student M number using the pattern ^(M|m)\\d{5}$
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (format: Mxxxxx)", "^(M|m)\\d{5}$");
        System.out.println("Your UC Student M number is: " + mNumber);

        // Get a menu choice using the pattern ^[OoSsVvQq]$
        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice (O, S, V, Q)", "^[OoSsVvQq]$");
        System.out.println("Your menu choice is: " + menuChoice);
    }
}
