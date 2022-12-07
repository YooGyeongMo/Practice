package 클래스_과제.ex9;

public class Test {
    MyClass doSomething()
    {
        MyClass b = new MyClass(); //6번째 줄
        return b;
    }

    public static void main(String[] args) {

        Test t = new Test();
        MyClass newObj = t.doSomething();
        newObj = new MyClass(); //13번째

        System.out.println(t);
        System.out.println(newObj);
        System.out.println(t.doSomething());

    }
}
