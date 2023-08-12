//Q9 Write a program to check whether a prime Number can be expressed as a Sum of Two Prime Numbers.
//
//        Hint: Apart from 2, all of the prime numbers are odd. So it is not possible to represent a prime number (which is odd) to be written as a sum of two odd prime numbers, so we are sure that one of the two prime numbers should be 2. So we have to check whether n-2 is prime or not.
//
//        Input:
//        13
//
//        Expected Output:
//        True
//
//



import java.util.Scanner;
public class ques_9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(isPrime(n) && isPrime(n-2)){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
    }
    public static boolean isPrime(int n){
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
            return false;
        }
        return true;
    }
}

