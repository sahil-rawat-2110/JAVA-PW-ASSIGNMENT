//Q3 - Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
//        missing number from the first N integers. There are no duplicates in the list.
//        Input:
//        n = 7
//        arr[] = {1, 2, 4, 6, 3, 7, 8}
//
//        Expected Output:
//        5




import java.util.Scanner;

public class ques_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements of array : " );
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (Math.abs(arr[i]) - 1 == n) {
                continue;
            }
            int ind = Math.abs(arr[i]) - 1;
            arr[ind] *= -1;
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if (arr[i] > 0){
                ans = i + 1;
                System.out.println(ans);
                return;
            }
        }
        System.out.println(n+1);
    }
}
