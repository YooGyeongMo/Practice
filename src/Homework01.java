import java.util.*;

public class Homework01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("국어: ");
        int kor = sc.nextInt();
        System.out.print("영어: ");
        int eng = sc.nextInt();
        System.out.print("수학: ");
        int math = sc.nextInt();

        double avg = (double)(kor + eng + math)/3;

        System.out.printf("%.2f\n",avg );
    }
}
