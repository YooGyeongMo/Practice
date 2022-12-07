package 클래스_과제.ex12;

public class TEst {

  int area(int a, int b){
        return a + b;
    }
  int rea(int a, int b, int c){
      return a+b+c;
  }

    public static void main(String[] args) {
        TEst test = new TEst();
        System.out.println(test.area(10,20));
        System.out.println(test.rea(10,20,400));
    }
}
