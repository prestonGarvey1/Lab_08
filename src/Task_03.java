import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userDay;

        int userYear = InputHelper.getRangedInt(scan, "Please enter your birth year: ", 1950, 2010);
        int userMonth = InputHelper.getRangedInt(scan, "Please enter your birth month:", 1, 12);

        // Seperate different day ranges for different months
        if (userMonth == 1 || userMonth == 3 || userMonth ==  5 || userMonth == 7 || userMonth == 8 || userMonth == 10 || userMonth == 12 ) {
            userDay = InputHelper.getRangedInt(scan, "Please enter the day you were born: ", 1, 31);
        } else if (userMonth == 2) {
            userDay = InputHelper.getRangedInt(scan, "Please enter the day you were born: ", 1, 29);
        } else {
            userDay = InputHelper.getRangedInt(scan, "Please enter the day you were born: ", 1, 30);
        }
        int userHour = InputHelper.getRangedInt(scan, "Please enter the hour you were born: ", 1, 24);
        int userMinute = InputHelper.getRangedInt(scan, "Please enter the minute when you were born: ", 1, 59);

        System.out.println("Year:     " + userYear + "\nMonth:       " +userMonth + "\nDay:         " + userDay + "\nHour:        " + userHour + "\nMinute:      " + userMinute);


    }
}