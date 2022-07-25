package study05_PrimitiveDataType;

public class Main {
    public static void main(String[] args) {
        // 변수 정의 (자료형 잘 선정해서)
        String name = "코드잇";
        int birthYear = 2015;
        int birthMonth = 7;
        int birthDate = 20;
        boolean isMarried = false;


        // 자기 소개
        System.out.println("이름: "+name);
        System.out.println(String.format("생일: %d년 %d월 %d일", birthYear, birthMonth, birthDate));
        System.out.println("결혼: "+isMarried);
    }
}



// OR

//public class Main {
//    public static void main(String[] args) {
//        // 변수 정의 (자료형 잘 선정해서)
//        String name;
//        int birthYear, birthMonth, birthDate;
//        boolean isMarried;
//        
//        //값 대입
//        name = "코드잇";
//        birthYear = 2015;
//        birthMonth = 7;
//        birthDate = 20;
//        isMarried = false;
//
//        // 자기 소개
//        System.out.println("이름: "+name);
//        System.out.println(String.format("생일: %d년 %d월 %d일", birthYear, birthMonth, birthDate));
//        System.out.println("결혼: "+isMarried);
//    }
//}