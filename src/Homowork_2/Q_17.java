package Homowork_2;

public class Q_17 {
    public static void main(String[] args) {
        int S = 3;
        double[] a = new double[S];
        double[] b = new double[S];
        for (int i = 0; i < S; i++) {
            a[i] = Math.random();
            b[i] = Math.random();
        }

        double vect = 0.0;
        for (int i = 0; i < S; i++) {
            vect += a[i] * b[i];
        }
        System.out.println("벡터의 내적 = " + vect);

    }
}

