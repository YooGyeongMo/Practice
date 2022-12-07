package Car_Prac;

import java.util.*;
import java.lang.*;

public class car {
    // 변수 = 초기화 값이 없어서 초기화해줘야함.
    // 필드값 = 초기화가 0 으로 된다, 문자열은 null로 초기화
    String color;  // private는 바로 값을 바꿔줄 수 없다. ( 숨기고싶은 값 )
    int speed;
    int gear;

    car(String c, int s, int g){
        color = c;
        speed = s;
        gear = g;
    }

    void print(){
        System.out.println("컬러 : " + color + "속도 : " + speed + "기어 : " + gear);
    }
    void changeGear(int g) {
        gear = g;
    }
    void speedUp(){
        speed += 10;
    }
    void speedDown(){
        if(speed >= 10) {
            speed -= 10;
        }
    }
    void setColor(String str){

        color = str;
    }
}
