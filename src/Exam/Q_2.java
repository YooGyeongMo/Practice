package Exam;

import java.util.*;

public class Q_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Random rnd = new Random();

        System.out.println("  "+"**점수출력***");

        int sum=0;
        double sum2=0;

        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                int num = rnd.nextInt(41)+60;
                System.out.print(" "+num);
                sum +=num;
                sum2 +=(float)num/25;
            }
            System.out.println();
        }
        System.out.print(" "+"합계: "+sum);  System.out.printf(" 평균:%.2f",sum2);
    }

}



