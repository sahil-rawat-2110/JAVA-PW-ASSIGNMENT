//Q5 - Convert a decimal double number into binary string for upto k precision digits
//        Input:
//        18.625
//        3
//
//        Output: (in string format)
//        10010.101


import java.util.Scanner;

public class ques_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal double number: ");
        double n = sc.nextDouble();
        System.out.println("Enter the number of precision digits : ");
        int k = sc.nextInt();
        int decimal_number = (int)n;
        double fractional_decimal_number = n - decimal_number;
        int decimal_to_binary = 0;
        int power = 1;
        while(decimal_number > 0){
            int rem = decimal_number % 2;
            decimal_to_binary += rem * power;
            power *= 10;
            decimal_number /= 2;
        }
        String s = Integer.toString(decimal_to_binary) + ".";
        while (k > 0 && fractional_decimal_number != 0){
            fractional_decimal_number *= 2;
            int digit = (int)fractional_decimal_number;
            s += digit;
            fractional_decimal_number = fractional_decimal_number - digit;
            k--;
        }
        System.out.println(s);
    }
}
