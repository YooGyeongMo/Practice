package Method;

import java.util.*;

public class Matches {
    public static void main(String[] args) {
        String str;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요");
            str = sc.nextLine();

            if (str.equals("quit"))
                break;

            if(str.matches("^www.\\ .(.+)"))
            {
                System.out.println("www. 으로 시작합니다.");
            }
            else{
                System.out.println("www. 로 시작하지않습니다.");
            }
        }
    }
}
