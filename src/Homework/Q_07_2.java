package Homework;

public class Q_07_2 {
    public static void main(String[] args) {
        int sum=0, i;
        for(i=1; i<=30; i++)
            for(int j=0; j<=5; j++)
                sum += i*j;
        System.out.println(sum);
    }
}
