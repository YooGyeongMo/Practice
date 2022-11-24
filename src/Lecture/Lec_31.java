package Lecture;

public class Lec_31 {
    public static void main(String[] args) {


        int[] prime = new int[100];
        int num = 0;
        int i = 0;
        int count = 0;
        System.out.println(" ***** 솟수 출력 *****");

        for (num = 2; num <= 100; num++) {
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                prime[count] = num;
                count++;
            }
        }
        for (int j = 0; j < count; j++) {
            System.out.printf("%5d", prime[j]);
            if ((j + 1) % 5 == 0)
                System.out.println();
        }
    }
}
