package Homework;

public class Q_11 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;
        for(int i=1; i <=100; i++) {
            sum += i;
            totalSum += sum;
        }
        System.out.println("totalSum="+totalSum); //
    } // main
}

