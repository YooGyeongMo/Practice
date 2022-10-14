package Java_algolithm;

import java.util.*;

public class Q_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int x = 0; x < i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

