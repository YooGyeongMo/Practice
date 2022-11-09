package Lecture;

import java.util.*;

public class Lec_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int[] s = new int[100];
        int i;
        int[] count = new int[6]; //7

        for (i = 0; i < 100; i++) {
            s[i] = rnd.nextInt(6) + 1; // 0부터 99개 즉 100개의 배열의 s 공간에 인덱스를 준다 즉, 1~6 중 난수를 100개 배열의 공간에 넣어준다.

            System.out.printf("%4d" , s[i]); //출력
             if ((i+1)%20 == 0) //줄바꿈
                  System.out.println(); //줄바꿈
        }
        for (i = 0; i < 6; i++) { //0 안 쓰고 1 ~7
            count[i] = 0;
        }
        for (i = 0; i < 100; i++) {
            count[s[i]-1]++;
        }
        for (i = 0; i < 6; i++) { // 0 안 쓰고 1~7
            System.out.println((i+1) + "의 개수 : " + count[i]);
        }
     }
    }



