//Q2 - Swap two numbers without the use of third variable.
//     Input: 5 10
//     Output: 10 5


import java.util.Scanner;
public class ques_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = sc.nextInt();
        System.out.print("Enter the second number : ");
        int y = sc.nextInt();
        System.out.println("Before swap the value of x and y is : " + x + " and " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swap the value of x and y is : " + x + " and " + y);

    }
}
