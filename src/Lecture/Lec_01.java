package Lecture;

import java.util.Scanner;
public class Lec_01 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;

        int sum = 0;
        System.out.println("첫번째 정수 입력 :" );
        a = scanner.nextInt();
        System.out.println("두번째 정수 입력 :" );
        b = scanner.nextInt();

        sum = a + b;

        System.out.println("두 정수의 합 : " + sum );
    }


}
