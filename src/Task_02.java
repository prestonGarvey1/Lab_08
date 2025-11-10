import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInt = InputHelper.getInt(scan, "Enter your integer: ");
        double userDouble = InputHelper.getDouble(scan, "Enter your double: ");

        System.out.println("Your favorite integer is " + userInt + ", and your favorite double is " +  userDouble + ".");
    }
}
