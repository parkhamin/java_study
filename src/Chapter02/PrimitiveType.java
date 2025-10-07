package Chapter02;

public class PrimitiveType {
    public static void main(String[] args){
        int a = 3;
        int b = a;

        System.out.println(a);
        System.out.println(b);

        a = 4;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 7;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // int 배열을 선언하고 값을 넣어주지 않아 int의 기본값인 0이 출력
        int[] array = new int[2];
        System.out.println(array[0]);
    }
}
