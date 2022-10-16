package Homework;

import java.util.*;

public class Q_12 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);

        System.out.print("첫번째 정수 입력:  ");
        n1 = input.nextInt();
        System.out.print("두번째 정수 입력:  ");
        n2 = input.nextInt();
        System.out.print("세번째 정수 입력 : ");
        n3 = input.nextInt();

        if(n1 > n2) {
            if(n1 > n3) {
                if(n2 > n3)
                    System.out.println("정렬된 숫자 : " + n3+ "  " + n2+ "  " + n1+ "  " );
                else    // n1 > n3 > n2
                    System.out.println("정렬된 숫자 : " + n2+ "  " + n3+ "  " + n1+ "  " );
            }
            else // n3 > n1 > n2
                System.out.println("정렬된 숫자 : " + n2+ "  " + n1+ "  " + n3+ "  " );
        }
        else if(n2 > n3) {
            if(n2 > n1) {
                if(n1 > n3) // n2 > n1 > n3
                    System.out.println("정렬된 숫자 : " + n3+ "  " + n1+ "  " + n2+ "  " );
                else // n2 > n3 > n1
                    System.out.println("정렬된 숫자 : " + n1+ "  " + n3+ "  " + n2+ "  ");
            }
        }
        else    // n3 > n1
            System.out.println("정렬된 숫자 : " + n1 + "  " + n2+"  " + n3 + "  ");
    }
}

