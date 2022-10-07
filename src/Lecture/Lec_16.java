package Lecture;

import java.util.Scanner;

public class Lec_16 {
    public static void main(String[] args) {
        long f = 1;
        int n;

        System.out.print("정수를 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            f = f * i;


            System.out.println("총 팩토리얼 : " + n + f);
        }
    }
}
