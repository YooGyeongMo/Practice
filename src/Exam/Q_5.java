package Exam;

import java.util.*;

public class Q_5 {
    public static void main(String[] args){
        Random rnd = new Random();

        int r = 0;
        int sum = 0;
        double avr = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    r = rnd.nextInt(99) + 101;
                    System.out.print(r + " ");
                    sum +=r;
                    avr = sum / 25;
                }
                System.out.println();

            }//for문 마지막
            System.out.printf("총합: %d  평균 : %.2f " , sum , avr);
    }//end of main

}//class
