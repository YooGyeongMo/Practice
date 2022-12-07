package 클래스_과제.ex7;

public class dog_Test {
    public static void main(String[] args) {
        dog dg = new dog("치와와", 4,"빨강색");

        System.out.println(dg.color);

        dg.barking();
        dg.hungry();
        dg.sleeping();
    }
}
