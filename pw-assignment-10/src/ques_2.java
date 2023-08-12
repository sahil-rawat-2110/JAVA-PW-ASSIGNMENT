//Q2 - Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find
//        union between these two arrays and print the number of elements of the union set.
//        Union of the two arrays can be defined as the set containing distinct elements from both
//        the arrays. If there are repetitions, then only one occurrence of element should be printed
//        in the union.
//
//        Input:
//        5 3
//        1 2 3
//        1 2 3 4 5
//
//        Output:
//        5


import java.util.Scanner;

public class ques_2{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array 1 and array 2: ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println("Enter the element of array 1 : ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scn.nextInt();
        }
        System.out.println("Enter the element of array 2 : ");
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = scn.nextInt();
            boolean check = false;
            for(int j = 0; j < n; j++){
                if(b[i] == a[j]){
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.println(b[i]);
            }
        }
    }
}

