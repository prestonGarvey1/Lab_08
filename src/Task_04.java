import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double userInput;
        boolean yesOrNo;
        double totalPrice = 0;

        do {
            userInput = InputHelper.getRangedDouble(scan, "Enter the item price: $", .50, 9.99);
            scan.nextLine();
            totalPrice += userInput;
            yesOrNo = InputHelper.getYNConfirm(scan, "Do you want to add another item? [Y/N]");
        }
        while (yesOrNo);

        System.out.printf("Total Cost in $:     " + "%.2f%n", totalPrice);
    }
}
