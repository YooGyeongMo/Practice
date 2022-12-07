package 클래스_과제.ex11;

public class Test {
    public static void main(String[] args) {
        String x = "abc" ;
        String str = x.toUpperCase();
        String y = str.replace('A', 'D'); //replace 대소문자 구별함.
        y = y + "xyz" ;
        System.out.println(y);
    }
}
