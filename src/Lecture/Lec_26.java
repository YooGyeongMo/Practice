package Lecture;

import java.util.*;

public class Lec_26 {
    public static void main(String[] args) {
        int max = 0 , min = 10000;
        Random rnd = new Random();

        int [] s = new int[20];
        int i ;

        for (i = 0; i < 20; i++){
            s[i] = rnd.nextInt(101); //난수 생성
        }

        for(i =0 ; i <20; i++){
            System.out.printf("%5d", s[i]);
            max = Math.max( s[i], max);
            min = Math.min( s[i], min);

            if((i+1)%5==0)
                System.out.println();  // 줄바꿈
//            if(min > s[i])
//                min = s[i];
//            if(max < s[i])
//                max = s[i];
        }
        System.out.println("최대값 : " + max +", 최소값 : " + min );
            }
        }

