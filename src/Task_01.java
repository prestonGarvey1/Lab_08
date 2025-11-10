//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;

        String username = InputHelper.getNonZeroLenString(scan, "Please enter your username.");
        System.out.println("The username you entered is: " + username);
    }
}