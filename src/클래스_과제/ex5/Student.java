package 클래스_과제.ex5;

public class Student {
    // 학생을 나타내는 클래스 Student를 만들어보자. 학생은 이름(name)과 학번(rollno), 나이를 가진다. Student 클래스를 작성하고 객체를 생성하여 테스트하라.

        String Student_Name;
        int Student_number = 0;
        int Student_age = 0;


    void show ()
    {
        System.out.println("이름  " +  Student_Name + "  학번  " + Student_number + "  나이  " + Student_age );
    }
}
