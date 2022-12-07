package Method;

import java.util.*;

public class 문자열_비교 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str2 = sc.nextLine();

        if(str.equals(str2)){
            System.out.println("같다.");
        }
        else{
            System.out.println("다르다");
        }
    }
}
