package Java_algolithm;

import java.util.*;

public class Q_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=n-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int x =0; x < i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

