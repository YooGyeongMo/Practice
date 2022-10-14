package Java_algolithm;

import java.util.*;

public class Q_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 입력 : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int x = 0; x < i; x++) {
                System.out.print("*");
                }
                System.out.println();

        }
    }

}
