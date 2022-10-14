package Java_algolithm;

import java.util.*;

public class Q_04 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("정수입력 : ");
        int n = sc.nextInt();

        for(int i = n ; i >= 0; i--){
            for(int x= 0; x <= i; x++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
