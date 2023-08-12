//Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and calculate Profit
//        or Loss.

//        Explanation : Formula for profit and loss
//        Profit = S.P - C.P
//        Loss = C.P - S.P
//        (S.P is Selling Price and C.P is Cost Price)
//
//        Sample Input :
//        Enter cost price: 4000
//        Enter selling price: 9560
//
//        Sample Output :
//        Profit = 5560




import java.util.Scanner;

public class ques_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price (C.P.) : ");
        int cost_price = sc.nextInt();
        System.out.println("Enter Selling Price (S.P.) : ");
        int selling_price = sc.nextInt();
        if (selling_price > cost_price){
            int profit = selling_price - cost_price;
            System.out.println("Profit = " + profit);
        }
        else {
            int loss = cost_price - selling_price;
            System.out.println("Loss = " + loss);
        }
    }
}
