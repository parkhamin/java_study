package Chapter02;

public class WrapperClass {
    public static void main(String[] args){
        // Integer i = new Integer(123);
        // Integer i = 123;

        System.out.println(123 == 123); // true
        System.out.println(new Integer(123) == new Integer(123)); // false
        // 두 객체가 같은지 비교하기 때문
        // 두 생성자를 통해 만든 다른 객체기 때문에 false 출력

        System.out.println(new Integer(123).equals(new Integer(123)));
    }
}
