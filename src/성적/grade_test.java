package 성적;

import java.util.Scanner;

public class grade_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("수학, 과학, 영어 순으로 입력하세요 ");
        int math = sc.nextInt();
        int sci = sc.nextInt();
        int eng = sc.nextInt();
        grade gd = new grade(math, sci, eng);

        gd.average = (gd.math + gd.sci + gd.eng)/3;

        System.out.println("평균은 " + gd.average);
    }
}
