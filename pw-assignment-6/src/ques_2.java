
//Q2 - Convert a binary number to decimal
//
//        Input:
//        10100011
//
//        Output:
//        163


import java.util.Scanner;

public class ques_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        int binary_number = sc.nextInt();
        int decimal_number = 0;
        int power = 1;
        while (binary_number > 0){
            int rem = binary_number % 10;
            decimal_number += rem * power;
            power *= 2;
            binary_number /= 10;
        }
        System.out.println(decimal_number);
    }
}
