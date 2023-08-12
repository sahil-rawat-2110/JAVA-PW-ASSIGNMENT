//Q2 - Write a program to print absolute value of a number entered by the user.
//        Sample Input : -1
//        Sample Output : 1

import java.util.Scanner;

public class ques_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        if (x < 0){
            x = x * -1;
            System.out.println("Absolute value of a number : " + x);
        }
        else {
            System.out.println("Number is already absolute");
        }


    }
}
