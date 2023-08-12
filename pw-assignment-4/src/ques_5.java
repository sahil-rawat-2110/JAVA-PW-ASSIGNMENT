//Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication and division.
//        Sample Input :
//        Enter an operator (+, -, *, /): -
//        Enter two numbers:
//        6
//        8
//
//        Sample Output :
//        6 - 8 = -2




import java.util.Scanner;

public class ques_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an operator (+, -, *, /)");
        char operator = sc.next().charAt(0);
        System.out.println("Enter two numbers: ");
        double first_number = sc.nextDouble();
        double second_number = sc.nextDouble();
        double result;
        switch (operator){
            case '+' :
                result = first_number + second_number;
                System.out.println(first_number + " + " + second_number + " = " + result);
                break;
            case '-':
                result = first_number - second_number;
                System.out.println(first_number + " - " + second_number + " = " + result);
                break;
            case '*':
                result = first_number * second_number;
                System.out.println(first_number + " * " + second_number + " = " + result);
                break;
            case '/':
                result = first_number / second_number;
                System.out.println(first_number + " / " + second_number + " = " + result);
                break;
            default:
                System.out.println("Please enter a valid operator");
                break;
        }

    }
}
