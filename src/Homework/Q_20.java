package Homework;

public class Q_20 {
    public static void main(String[] args) {
        int k, prime;

        for(k =2; k<=100; k++) {
            prime = 0;
            for(int i=2; i<=k-1; i++ ) {
                if(k%i ==  0) {
                    prime++;
                }

            }
            if(prime == 0) System.out.println(k);
        }
    }

}
