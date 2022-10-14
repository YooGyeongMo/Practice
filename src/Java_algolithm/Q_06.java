package Java_algolithm;

import java.util.*;

public class Q_06 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수입력 : ");
        int n = sc.nextInt();

           for(int i =0; i<n; i++) {
              for(int j =0; j<i; j++) {
                  System.out.print(" ");
              }
              for(int j = n; j>i; j--){
                  System.out.print("*");

           }

        System.out.println();
        }

    }
}
