package Lecture;

import java.util.*;

public class Lec_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;

        do {
            System.out.print("옳바른 월을 입력하시오 [1-12]:");
            i = sc.nextInt();

        }while (i < 1 || i > 12);
        System.out.print("사용자가 입력한 월은 : " + i);
    }


}
