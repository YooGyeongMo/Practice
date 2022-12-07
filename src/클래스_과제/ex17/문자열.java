package 클래스_과제.ex17;

import java.util.*;

public class 문자열 {
// 사용자에게서 받은 문자열을 역순으로 화면에 출력하는 프로그램을 작성하여 보자. 예를 들어서 사용자가 "secret"를 입력하면 “terces"를 출력한다.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("문자열을 입력하시오 : ");
    String str = sc.nextLine();

    for(int i = str.length()-1; i>=0; i--){ // 0~5까지 반복 해서 집어넣는다 i에.
        System.out.print(str.charAt(i)); //charAt 은 인덱스 그래서 0~5 그러나 length = 1~6문자열에서 문자를 뽑는다  s e c r e t length는 1부터
    }


}
}
