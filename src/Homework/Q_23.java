package Homework;

import java.util.*;

public class Q_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력:");
        int num1 = sc.nextInt();
        System.out.print("정수 입력:");
        int num2 = sc.nextInt();

        System.out.print("부호 입력:");
        char n = sc.next().charAt(0);

        if(n=='+') {
            System.out.println(num1+num2);
        }
        else if(n=='-') {
            System.out.println(num1-num2);
        }
        else if(n=='*') {
            System.out.println(num1*num2);
        }
        else if(n=='/') {
            if(num2==0) {
                System.out.println("출력불가");
                System.out.println(num1/num2);
            }

        }

    }

}
