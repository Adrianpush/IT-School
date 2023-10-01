package session5_advancedflowcontrol.homework;

public class MonthNameFinder {

    public static void main(String[] args) {
        printMonth(UserInput.getValidInt("Please enter the the number of the month... \n"));
    }

    /**
     * Write a program that asks the user to enter a number between 1 and 12.
     * Print the name of the corresponding month or "Invalid Month" if out of range.
     */
    public static void printMonth(int input) {
        String message = "";
        switch (input) {
            case 1:
                message = "January";
                break;
            case 2:
                message = "February";
                break;
            case 3:
                message = "March";
                break;
            case 4:
                message = "April";
                break;
            case 5:
                message = "May";
                break;
            case 6:
                message = "June";
                break;
            case 7:
                message = "July";
                break;
            case 8:
                message = "August";
                break;
            case 9:
                message = "September";
                break;
            case 10:
                message = "October";
                break;
            case 11:
                message = "November";
                break;
            case 12:
                message = "December";
                break;
            default:
                message = "Invalid Month";
        }
        System.out.println(message);
    }
}