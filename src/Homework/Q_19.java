package Homework;

import java.util.*;

public class Q_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("실수 x 값을 입력하시오 : ");
        double x = sc.nextDouble();

        if (x >= 0) {
            System.out.println(x * x * x - (9 * x + 2));
        } else if (x < 0) {
            System.out.println(7 * x + 2);
        }

    }
}

