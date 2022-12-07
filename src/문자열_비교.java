import java.util.*;

public class 문자열_비교 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);


        System.out.println("문자열 입력 : ");
        str = sc.nextLine();
        str = str.toLowerCase();

        char [] strArr = str.toCharArray();
        Arrays.sort(strArr); //오름차순
        String result = new String(strArr);

        System.out.println(result);

        System.out.println(str.getClass().getName());
    }
}
