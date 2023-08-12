//Q5 – Write a program to print the cross pattern given below (in the shape of X):
//
//        *   *
//         * *
//          *
//         * *
//        *   *



public class ques_5 {
    public static void main(String[] args) {
       int n = 5;
       for (int i = 1; i <= n; i++){
           for (int j = 1; j <= n; j++){
               if(i == j || i+j == (n+1) ){
                   System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
}