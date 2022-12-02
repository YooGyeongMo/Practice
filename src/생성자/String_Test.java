package 생성자;

import java.lang.*;

public class String_Test {

    public static void main(String[] args) {
        String str = new String("Hello world!");

        System.out.println(str.charAt(6));  // 인덱스 위치에 문자 보여줌.
        System.out.println(str.charAt(11));
        System.out.println(str.equals("Hello World!"));// 같은 문자열인지 알려줌.
        System.out.print(str.compareTo("Aello world!"));
    }


}
