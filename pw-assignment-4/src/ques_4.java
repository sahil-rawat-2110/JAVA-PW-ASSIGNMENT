//Q4 - Write a program to print positive number entered by the user, if user enters a negative number, it is
//        skipped.
//        Sample Input : Enter an integer: -6
//        Sample Output : The number is negative and skipped




import java.util.Scanner;

public class ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int x = sc.nextInt();
        if(x < 0){
            System.out.println("The number is negative and skipped ");
        }
        else {
            System.out.println("The number is positive");

        }

    }
}
