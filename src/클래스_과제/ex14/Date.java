package 클래스_과제.ex14;

import java.lang.*;

public class Date {
// 날짜를 나타내는 클래스 Date를 만들어보자.
// Date는 연도,월,일 등의 속성을 가지며,
// 날짜를 “2012.7.12”과 같이 출력하는 메소드 print1(),
// 날짜를 “July 12, 2012”와 같이 출력하는 print2() 등의 메소드를 가진다.
// Date 클래스를 작성하고 객체를 생성하여서 테스트하라.
    int year,day;
    Object month;

    void print1(int a, int b, int c){
        year = a;
        month = b;
        day =  c;

        System.out.println(year + "." + month + "." + day);
        

        

    }
    void print2(Object a, int b, int c){
        month = a;
        day = b;
        year = c;
        System.out.printf("%s %d, %d", month, day ,year);
        System.out.println(a.getClass().getName());
        System.out.println(month + " " + day  + ", " + year);

    }

    public static void main(String[] args) {
        Date dt = new Date();

        dt.print1(2012, 7, 12);
        dt.print2("July", 12 , 2012);
    }
}
