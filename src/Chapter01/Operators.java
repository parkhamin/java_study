package Chapter01;

public class Operators {
    public static void main(String[] args) {
        String myString = "Hello " + "World!!"; // 문자열 합치기
        System.out.println(myString);
        System.out.println("데카르트는 \"나는 생각한다. 고로 존재한다.\"라고 말했다.");
        // 문자열과 숫자를 더하면 숫자가 저절로 문자열로 바뀌고, 문자열과 불린을 더하면 불린이 저절로 문자열로 바뀜.
        System.out.println("=========================");

        System.out.println("숫자 연산자");
        int a = 9;
        int b = 5; // 자료형이 double일 경우에는 나눗셈의 결과가 1.8이 출력
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b)); // 소수 부분은 버려지고 정수 부분만 출력
        System.out.println(a + " % " + b + " = " + (a % b));
        System.out.println("=========================");

        System.out.println("비교 연산자");
        System.out.println(3 + " > " + 2 + " : " + (3 > 2));
        System.out.println(3 + " < " + 2 + " : " + (3 < 2));
        System.out.println(3 + " >= " + 2 + " : " + (3 >= 2));
        System.out.println(3 + " <= " + 2 + " : " + (3 <= 2));
        System.out.println(3 + " == " + 2 + " : " + (3 == 2));
        System.out.println(3 + " != " + 2 + " : " + (3 != 2));

        System.out.println("=========================");
        System.out.println("단항 연산자");
        int myInt = 3;
        System.out.println(-myInt);
        System.out.println(--myInt); // 실제 myInt의 값을 1을 감소시키고 저장
        System.out.println(++myInt);

        System.out.println("=========================");
        System.out.println("불린 연산자");
        System.out.println("AND 연산자");
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false
        // AND의 경우 양쪽 다 true여야만 true, 한쪽이라도 false이면 false
        System.out.println("OR 연산자");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false
        // OR의 경우 양쪽 다 false여만 false, 한쪽이라도 true라도 true
        System.out.println("NOT 연산자");
        System.out.println(!true); // false
        System.out.println(!false); // true
    }
}