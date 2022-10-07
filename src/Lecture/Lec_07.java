package Lecture;

import java.util.Scanner;

public class Lec_07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = 1000;
        System.out.print("실적을 입력하시오(단위: 만윈): ");
        int a = sc.nextInt();
        int b = a - t;
        int bonus = b/10;

        if(a > 1000) {
            System.out.println("실적 달성 씨발꺼 ! ");
            System.out.println("보너스 : " + bonus);
        }
        else
            {
            System.out.println("실적 달성 실패 씨빨꺼 !");
        }
    }
}
