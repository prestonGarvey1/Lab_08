import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userSSN = InputHelper.getRegExString(scan, "Enter your SSN in the correct format. (XXX-XX-XXXX):", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is: " + userSSN);
        String userID = InputHelper.getRegExString(scan, "Enter your Student M Number in the correct format. (MXXXXX):", "(M|m)\\d{5}");
        System.out.println("Your Student M Number is: " + userID);
        String userChoice = InputHelper.getRegExString(scan, "Menu: O - Open  S - Save  V - View    Q - Quit", "[OoSsVvQq]");
        System.out.println("You chose: " + userChoice.toUpperCase());
    }
}
