package Chapter01;

public class HelloWorld { // class HelloWorld란 HelloWorld라는 클래스를 정의,
                          // public이란 접근 제어자로 어디에서나 접근 가능
    public static void main(String[] args){ // main이란 메소드(함수)의 이름
                                            // 메소드란 클래스 안에 정의된 함수를 말함.
                                            // 자바는 클래스 기반 언어이기 때문에 자바의 함수는 모두 메소드
                                            // main 메소드는 args라는 문자열 배열을 파라미터로 함.
                                            // void는 메소드의 리턴 값의 자료형 (void일 경우 리턴 값이 없음)
        System.out.println("Hello World!"); // System이라는 클래스의
                                            // out이라는 변수의
                                            // println이라는 메소드를 호출해주세요!
                                            // 파라미터로 문자열 "Hello World!" 넘겨주어 콘솔에 출력됨.
    }
}
