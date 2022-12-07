package 생성자;

import java.util.*;

public class Parse {
    public static void main(String[] args) {
        String s1, s2;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("더 할 숫자 입력 : ");
        s1 = input.next();
        s2 = input.next();
        sum += Integer.parseInt(s1);
        sum += Integer.parseInt(s2);



        System.out.println(s1 +  " + " + s2  + " = "  + sum);
        System.out.println("이진수 : " + Integer.toBinaryString(sum));
        System.out.println(s1.getClass().getName());
    }
}
