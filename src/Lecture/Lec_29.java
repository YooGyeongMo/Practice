package Lecture;

import java.util.*;

public class Lec_29 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[] arr = new int[11];
        int j = 0;

        while (true) {
            System.out.println("----------------------------------------------");
            for (i = 1; i < 11; i++) {
                arr[i] = i;
                System.out.printf("%4d", arr[i]);
            }
            System.out.println();
            System.out.println("----------------------------------------------");
            System.out.print("원하시는 좌석 번호를 입력하세요(종료는 -1) : ");
            j = sc.nextInt();

            if (j == -1)
                break;
            if ( arr[j-1] == 0 ){
                arr[j-1] = 1;
                System.out.println("예약되었습니다.");
            }
            else {
                System.out.println("이미 예약된 자리입니다.");
            }

        }
    }
}

