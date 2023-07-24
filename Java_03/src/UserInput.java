import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int number1, number2;
        double doubleNum1, doubleNum2;
        String fName, lName;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter your first number : ");
        number1 = Integer.parseInt(userInput.nextLine());

        System.out.print("Please enter your second number : ");
        number2 = Integer.parseInt(userInput.nextLine());
        int result = number1 + number2;
        System.out.println("Sum of " + number1 + " and " + number2 + " is " + result);

        System.out.print("Please enter your third number : ");
        doubleNum1 = Double.parseDouble(userInput.nextLine());

        System.out.print("Please enter your fourth number : ");
        doubleNum2 = Double.parseDouble(userInput.nextLine());
        double doubleValueResult = doubleNum1 + doubleNum2;
        System.out.println("Sum of " + doubleNum1 + " and " + doubleNum2 + " is " + doubleValueResult);
        System.out.print("Please enter your first name : ");
        fName = userInput.nextLine();
        System.out.print("Please enter your last name : ");
        lName = userInput.nextLine();
        System.out.println("Your full name is : " + fName + " " + lName);
    }
}
