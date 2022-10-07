package Lecture;

import java.util.Date;

public class Lec_09 {
    public static void main(String[] args){

        Date date = new Date();
        int currentHour =date.getHours();

        System.out.println("현재시간은 " + date);
        if (currentHour < 11 ){
            System.out.println("좋은아침 !! 시팔라마");
        }
        else if(currentHour < 15){
            System.out.println("좋은점심 !! 시팔라마");
        }
        else if(currentHour < 20){
            System.out.println("좋은저녁 !! 시팔라마");
        }
        else if(currentHour > 25 || currentHour < 0){
            System.out.println("그런시간이 있을리가... ㅋ");
        }
        else {
            System.out.println("제대로 입력했는지 확인해봐 쳐맞기 싫으면");
        }
    }
}
