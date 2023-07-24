import java.util.Scanner;

public class UserInput {
    public static void main(String [] args){
        int number1,number2;
        double doubleNum1,doubleNum2;
        String fName,lName;
        var n = 1;
        System.out.println(n);
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your first number : ");
        number1 = userInput.nextInt();
        System.out.print("Please enter your second number : ");
        number2 = userInput.nextInt();
        int result = number1 + number2;
        System.out.println("Sum of "+number1 +" and "+number2 +" is "+result);
        System.out.print("Please enter your third number : ");
        doubleNum1 = userInput.nextDouble();
        System.out.print("Please enter your fourth number : ");
        doubleNum2 = userInput.nextDouble();
        double doubleValueResult = doubleNum1 + doubleNum2;
        System.out.print("Sum of "+doubleNum1 +" and "+doubleNum2 +" is "+doubleValueResult);
        userInput.nextLine();
        System.out.print("Please enter your first name : ");
        fName = userInput.nextLine();
        System.out.println("Please enter your last name : ");
        lName = userInput.nextLine();
        System.out.println("Your full name is : "+fName+""+lName);
    }
}
