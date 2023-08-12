//Q3 - Add two numbers given in different base
//     Input: 1st number is decimal, 2nd number is binary
//     43
//     10100011
//
//     Output:
//     206


import java.util.Scanner;

public class ques_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        int decimal_number = sc.nextInt();
        System.out.println("Enter the binary number : ");
        int binary_number = sc.nextInt();
        int changed_decimal_number = 0;
        int power = 1;
        while(binary_number > 0){
            int rem = binary_number % 10;
            changed_decimal_number += rem * power;
            power *= 2;
            binary_number /= 10;
        }
        System.out.println(decimal_number + changed_decimal_number);
    }
}
