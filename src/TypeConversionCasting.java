public class TypeConversionCasting {
    public static void main(String[] args){
        /*
        숫자형 랭킹 double >> float >> long >> int >> short >> byte
        double x = 3.14;
        int y = x;
        더 정밀한 double인 x를 y로 형변환하려고 했기 때문에 오류
        억지로 형변환을 하고 싶을 경우
         */
        double x = 3.14;
        int y = (int) x; // -> type casting
        System.out.println(y); // 3 출력

        int a = 9;
        int b = 5;
        System.out.println(a / b); // 소수는 버리고 정수 한자리 1 출력 (데이터의 손실)
        System.out.println((double) a / b); // 1.8 출력
    }
}
