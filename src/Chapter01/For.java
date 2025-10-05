package Chapter01;

public class For {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <= 5; i++) { // i는 for문 안에서만 사용 가능. 초기화식 ; 종결제어식 ; 증감제어식
            sum += i;
        }

        System.out.println(sum);
    }
}
