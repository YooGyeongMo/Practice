package Practice;

import java.util.*;

public class Pc_11 {
    public static void main(String[] args){
        int num = 0 , sum = 0;

        //10 으로 나머지 연산을 하면 마지막 자리를 얻는다.
        System.out.print("숫자를 입력하세요.(예:12345)>");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        num = Integer.parseInt(tmp);

        while(num !=0 ){
            //num을 10으로 나눈 나머지를sum에 더함
            sum += num%10;
            System.out.printf("sum=%3d num=%d%n", sum , num);
            num /= 10;
        }

        System.out.println("각 자리수의 합: " +sum);
    }
}
