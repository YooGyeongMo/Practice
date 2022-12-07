package 클래스_과제.ex10;

public class Test {
    public static void main(String[] args) {
        String a = "javaprogramming" ;
        a = a.substring(5, 7); //인덱스 5~7까지만 자름.
        System.out.println(a);
        char b = a.charAt(1); // 문자 b 변수에 인덱스 5~7까지 자른 a의 문자 인덱스 1 번째 출력
        System.out.println(b);
        a = a + b; // ro 와 o 가 더해져서
        System.out.println(a);// roo
    }
}
