package 클래스_과제.ex16;

public class Movie {
//    영화 Movie 클래스를 정의하여 보자.
//    Movie 클래스는 영화 제목, 평점, 감독, 발표된 연도 등의 필드를 가진다.
//    영화의 모든 정보를 화면에 출력하는 print()라는 메소드를 구현하라.
//    Movie 클래스를 작성하고 객체를 생성하여서 테스트하라.

    String Title;
    int score;
    String dir;
    int year;


    void print(){
        System.out.println("영화의 제목은 " + Title + "이고, 평점은 " + score + "영화 제작을 한 감독은 " + dir + " 발표된 연도는 " + year + "이다.");
    }
}
