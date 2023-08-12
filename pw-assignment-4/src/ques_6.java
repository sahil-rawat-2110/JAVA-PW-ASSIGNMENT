//Q6 - Write a program to calculate marks to grades . Follow the conversion rule as given below :
//
//        100 - 90  --->  A+
//        90 - 80  --->   A
//        80 - 70  --->   B+
//        70 - 60  --->   B
//        60 - 50  --->   C
//        50 - 40  --->   D
//        40 - 30  --->   E
//        30 - 00  --->   F
//Sample Input : Enter Your Marks: 98
//Sample Output : Your Grade is A+


import java.util.Scanner;

public class ques_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();
        if (marks >= 90){
            System.out.println("Your Grade is A+");
        }
        else if (marks >= 80) {
            System.out.println("Your Grade is A");
        }
        else if (marks >= 70) {
            System.out.println("Your Grade is B+");
        }
        else if (marks >= 60) {
            System.out.println("Your Grade is B");
        }
        else if (marks >= 50) {
            System.out.println("Your Grade is C");
        }
        else if (marks >= 40) {
            System.out.println("Your Grade is D");
        }
        else if (marks >= 30) {
            System.out.println("Your Grade is E");
        }
        else if (marks < 30) {
            System.out.println("Your Grade is F");
        }
        else {
            System.out.println("Enter valid marks");
        }



    }
}
