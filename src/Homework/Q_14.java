package Homework;

import java.util.*;

public class Q_14 {
    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);

        System.out.print("알파벳을 입력하세요 : ");
        str = input.nextLine();

        String temp = str.toUpperCase();

        switch(temp.charAt(0)) {
            case 'A','a' :
            case 'E','e' :
            case 'I','i' :
            case 'O','o' :
            case 'U','u' :
                System.out.println("모음입니다.");
                break;
            default :
                System.out.println("자음입니다.");
        }
    }
}

