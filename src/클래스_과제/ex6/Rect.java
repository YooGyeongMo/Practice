package 클래스_과제.ex6;

public class Rect {
    public static void main(String[] args) {

        Rectangle myRect = new Rectangle();

        myRect.w = 10;
        myRect.h = 20;

        System.out.println("면적은 " + myRect.area());
        System.out.println("둘레는 " + myRect.perimeter());
    }
}
