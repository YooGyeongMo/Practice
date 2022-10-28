package Lecture;

import java.util.*;

public class Lec_20 {
    public static void main(String [] args){
        double avr = 0;
        int sum = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);


        System.out.println("몇명의 학생 : ");
        count = sc.nextInt();
        int[] score = new int[count];
        for(int i = 0; i < count; i++) {

            System.out.println("성적을 입력하세요 : ");
            int j = sc.nextInt();

                score[i] = j;

                sum += score[i];
          }

        //for 마지막.

            avr = sum / count;

        System.out.printf("평균 성적은 : %.2f ", avr );


    }//메인
}//클래스열
