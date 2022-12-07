package 클래스_과제.ex3;

public class Test {
    public static void main(String[] args) {
        Rectangle myReact = new Rectangle();

        myReact.width = 10;
        myReact.height = 20;

        System.out.println("면적은 " + myReact.area());
    }
}
