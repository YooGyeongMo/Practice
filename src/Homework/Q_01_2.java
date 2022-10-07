package Homework;

import java.util.*;

public class Q_01_2 {
    public static void main(String[] args) {
        // (2) x와 y 중에서 큰 값을 max에 저장하고 작은 값을 min에 저장한다.
        Scanner sc = new Scanner(System.in);
        System.out.print("x값을 입력하세요 : ");
        int x = sc.nextInt();
        System.out.print("y값을 입력하세요 : ");
        int y = sc.nextInt();
        int max, min;

        if (x > y) {
            max = x;
            min = y;
            System.out.println("큰 값은 : " + max + "입니다.");
            System.out.println("작은 값은 : " + min + "입니다.");
        } else if (x < y) {
            max = y;
            min = x;
            System.out.println("큰 값은 : " + max + "입니다.");
            System.out.println("작은 값은 : " + min + "입니다.");
        }
        else {
            System.out.println("두 수는 같은 수 이거나 큰 수를 가릴 수 없습니다.");
        }

    }//end of main
}//end of class
