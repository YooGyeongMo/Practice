package Homework;

public class Q_09_1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=100;i++) {
            if( i%3==0 || i%4==0)

            sum += i;
        }
        System.out.println("sum="+sum);
    }
}

