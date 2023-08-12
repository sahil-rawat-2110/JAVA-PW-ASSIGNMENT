//Q1 - Write a Java method to compute the average of three numbers
//        Input:
//        25
//        45
//        65
//
//        Output:
//        45


import java.util.Scanner;

public class ques_1 {

     static int avg(int a, int b, int c) {
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average : " + avg(a,b,c));

    }


}
