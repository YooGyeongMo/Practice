package Practice;

import java.util.*;

public class Pc_16 {
    public static void main(String[] args) {
        //list
        Scanner sc = new Scanner(System.in);
        int student = 0;
        int grade = 0;
        int sum = 0;
        int avr = 0;
        System.out.print("학생 수를 입력하세요 : ");
        student  = sc.nextInt();



        int[] arr = new int[student];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("학생의 %d의 성적을 입력하세요 : ", i + 1);
            grade = sc.nextInt();

            if (grade >= 0 && grade <= 100) {
                sum += grade;
                avr = sum / arr.length;

            }
            else {
                System.out.println(" 다시 입력하세요 .");

            }
        }
            System.out.println("학생들의 점수 평균은 " + (double)avr );

        }
    }
