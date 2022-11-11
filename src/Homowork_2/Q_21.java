package Homowork_2;

import java.util.Scanner;

public class Q_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] hx_bin = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};

        System.out.print("16진수 문자열을 입력하시오: ");
        String s = sc.nextLine();

        System.out.print(s + "에 대한 이진수는 ");
        for(int i =0; i<s.length(); i++)
        {
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57)
                System.out.print(" " + hx_bin[s.charAt(i) -48]);

            else if(s.charAt(i)>= 97 && s.charAt(i) <= 102)
                System.out.print(" " + hx_bin[s.charAt(i)-87]);
            else if(s.charAt(i)>= 65 && s.charAt(i) <= 70)
                System.out.print(" " + hx_bin[s.charAt(i)-55]);
        }
        System.out.println("입니다.");
    }
}

