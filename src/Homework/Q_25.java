package Homework;

import java.util.*;

public class Q_25 {
    public static void main(String[] args) {

        double i;
        double sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("n을 입력하시오:");
        double n = sc.nextDouble();

        for(i=1; i<=n; i++) {
            sum += 1/i;
        }
        System.out.println(sum);
    }

}

