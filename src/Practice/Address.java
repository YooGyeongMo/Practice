//package Practice;
//
//import java.util.*;
//
//public class Address {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String [] name = new String[10];
//        String [] phone = new String[10];
//        String search;
//        int count = 0;
//        int menu = 0;
//
//        System.out.println("====== 간단 주소록 메뉴 ======");
//        System.out.println("1.등록");
//        System.out.println("2.검색");
//        System.out.println("3.출력");
//        System.out.println("4.종료");
//        System.out.println("==========================");
//        System.out.println("메뉴 선택 : ");
//        menu = sc.nextInt();
//
//        while(true){
//
//            if(menu == 1){
//                System.out.println("====== 주소록 등록 ======");
//                System.out.println("등록할 이름 : " );
//                name[count] = sc.next();
//                count++;
//                System.out.println("등록할 번호 : ");
//                phone[count] = sc.next();
//                count++;
//                break;
//
//            }
//            else if (menu == 2){
//                System.out.println("검색할 이름 : ");
//                search = sc.nextLine();
//                for(int i = 0; i<count; i++ ){
//                    if(search.equals(name[i])){
//                        System.out.println(name[i] + " " + phone[i] + "  " );
//                    }
//                }
//            }
//            else if (menu == 3 ){
//                    System.out.println(name[])
//
//                }
//
//            }
//
//        }
//
//    }
//}
