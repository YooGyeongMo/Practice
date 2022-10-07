package Lecture;

import java.util.Scanner;

public class Lec_08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("성적을 입력하시오: ");
        int a = sc.nextInt();

        if(a > 100 || a < 0) {
            System.out.println("그런 점수는 없다 개새끼야!");
        }
        else if(a >= 90) {
            System.out.println("학점 A ");
        }

        else if(a >= 80) {
            System.out.println("학점 B ");
        }
        else if(a >= 70){
            System.out.println("학점 C");
        }
        else {
            System.out.println("공부 좀 해라 정신병자야");
        }
    }
}
