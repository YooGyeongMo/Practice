package Lecture;

import java.util.*;

public class Lec_15 {
    public static void main(String[] args) {
       int x,y,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("두 개의 정수를 입력하시오 (큰수, 작은수) : ");
        x = sc.nextInt();
        y = sc.nextInt();
        while (y != 0) {
            r = x % y;
            x = y;
            y = r;
        }
        System.out.println("최대 공약수 : " + x );
    }
}
