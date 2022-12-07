package 클래스_과제.ex7;

public class dog {
    String bread;
    int age;
    String color;

    dog(String b, int a, String c){
        bread = b;
        age = a;
        color = c;
    }

    void barking(){
        System.out.println("왈왈!!! 왈왈!! 쁴아양 와왈!!");
    }
    void hungry(){
        System.out.println(" 꼬르륵...꼬르륵.. 배고파잉..");
    }
    void sleeping(){
        System.out.println(" 드르렁... 드르렁 .. zzzZZZZ");
    }
}
