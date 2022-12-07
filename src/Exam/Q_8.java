package Exam;

import java.util.*;

public class Q_8 {
        public static void main(String [] args) {

            Scanner sc = new Scanner(System.in);

            float a = 0;
            float b = 0;
            double div;

            System.out.print("첫번째 수: ");
            a = sc.nextInt();

            System.out.print("두번째 수 : ");
            b = sc.nextInt();

            div = a / b - 0.000001;


            if (b == 0) {
                System.out.print("[계산오류] 0으로 나눌 수 없습니다.");
            }

            System.out.printf( "%.0f / %.0f = %.6f", a,b,div  );

        }


    }


