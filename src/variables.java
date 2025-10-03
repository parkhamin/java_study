/*
    int x;
    [자료형] [변수의 이름]
    * 규칙
    1. 대소문자 구분(codeit과 codeIt는 서로 다른 변수)
    2. 숫자로 시작 X
    3. 자바의 예약어 사용 불가
    4. 특수기호는 밑줄, $ 외에 사용 불가
 */
public class variables {
    public static void main(String[] args){
        int age;
        age = 27;

        int num = 21; // 변수 선언과 값을 동시에 선언과 저장 가능
        age = 26;

        // age = 22.6; // 오류

        age = num;
        age = age + 1;

        System.out.print("Hello, I'm " + age + ".");
    }
}
