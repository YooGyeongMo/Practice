package Lecture;

import java.util.*;

public class Lec_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("알파벳을 입력하세요 : ");
        String eng;

        eng = sc.next();

        switch (eng) {
            case ("a"):
            case ("A"):
            case ("e"):
            case ("E"):
            case ("i"):
            case ("I"):
            case ("o"):
            case ("O"):
            case ("u"):
            case ("U"):
                break;
                default:
                System.out.println(eng + "자음입니다.");
        }
        System.out.println(eng + "모음입니다.");
    }



    }

