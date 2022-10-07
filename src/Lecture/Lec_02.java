package Lecture;

import java.util.Scanner;

public class Lec_02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

       System.out.println("정수의 1의 자리 숫자 :" + a%10 + "입니다.");

    }
}
