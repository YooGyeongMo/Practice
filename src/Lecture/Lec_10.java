package Lecture;

import java.util.*;

public class Lec_10 {
    public static void main(String[] args) {
        System.out.println(" *** 점의 좌표를 입력하세요 *** ");
        Scanner sc = new Scanner(System.in);
        System.out.print("- X좌표 : ");
        int x = sc.nextInt();
        System.out.print("- Y좌표 : ");
        int y = sc.nextInt();
        // 몇분면 인지 확인해야함 1분면은 x가 y가 + 2사분면은 x-  y가 + 3사분면은 x y 둘다 - , 4사분면은 x는 양 y는 음
        if (x > 0 && y > 0) {
            System.out.println("- 좌표 [" + x + "," + y + "]은 1사분면의 점입니다.");
        } else if (x < 0 && y > 0) {
            System.out.println("- 좌표 [" + x + "," + y + "]은 2사분면의 점입니다.");
        } else if (x < 0 && y < 0) {
            System.out.println("- 좌표 [" + x + "," + y + "]은 3사분면의 점입니다.");
        } else if (x > 0 && y < 0) {
            System.out.println("- 좌표 [" + x + "," + y + "]은 4사분면의 점입니다.");
        } else {
            System.out.println("- 좌표 [0 , 0]입니다. ");
        }

    }
}
