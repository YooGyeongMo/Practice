package Homework;

import java.util.*;

public class Q_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("출력하고 싶은 항의 개수: ");
        int k = sc.nextInt();

        long a = 0,b=1,c;
        int i;

        for(i=1; i<=k; i++) {
            c = a+b;
            a = b;
            b = c;

            System.out.println(c);
        }
    }

}
