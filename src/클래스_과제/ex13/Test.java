package 클래스_과제.ex13;

public class Test {
//     2개의 정수의 합을 구하는 sum()과 2개의 double형 실수의 합을 구하는 sum()을 메소드 오버로딩을 이용하여 정의하라.
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(double a, double b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Test est = new Test();

        est.sum(1,2);
        est.sum(20.12, 20.39);
        est.sum(2, 1);
    }

}
