package 클래스_과제.ex12;

public class Cal {
    //2개의 정수의 합을 구하는 sum()과 3개의 정수의 합을 구하는 sum()을 메소드 오버로딩을 이용하여 정의하라.
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    } // 정수 3개의 합
    void sum(int a, int b){
        System.out.println(a + b);
    } // 정수 2개의 합

    public static void main(String[] args) {
        Cal cul = new Cal();
        cul.sum(10,20);
        cul.sum(10,20,30);
    }
}
