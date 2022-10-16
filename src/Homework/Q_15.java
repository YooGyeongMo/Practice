package Homework;

import java.util.*;

public class Q_15 {
    public static void main(String[] args) {
        double avg_weight;
        int height, weight;

        Scanner sc = new Scanner(System.in);
        System.out.println("키를 입력하시오 : ");
        height = sc.nextInt();
        System.out.println("몸무게를 입력하시오 : ");
        weight = sc.nextInt();

        avg_weight = (height - 100) * 0.9;

        if(weight > avg_weight + 10)
            System.out.println("과체중입니다.");
        else if(weight < avg_weight - 10)
            System.out.println("저체중입니다.");

        else
            System.out.println("정상 체중입니다.");
    }
}