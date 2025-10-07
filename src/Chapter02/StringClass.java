package Chapter02;

public class StringClass {
    public static void main(String[] args){
        String myString = "aBc";

        // 대소문자 변환
        System.out.println(myString.toUpperCase());
        System.out.println(myString.toLowerCase());
        System.out.println(myString);

        // 문자열 비고
        System.out.println(myString.toLowerCase() == "abc");
        // 참조형의 비교연산자이기 때문에 두 인스턴스가 같은 인스턴스인지 확인하는 역할
        // 두 문자열의 내용이 같은지 비교하려면 equals 메소드 사용
        System.out.println(myString.toLowerCase().equals("abc"));
    }
}
