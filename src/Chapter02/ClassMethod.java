package Chapter02;

import java.util.Random;

public class ClassMethod {
    public static void main(String[] args){
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(3, 7));
        System.out.println(Math.random()); // 0.0과 1.0 사이의 랜덤값

        // 절댓값
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(8));

        // 최솟값, 최댓값
        System.out.println(Math.max(4, 10));
        System.out.println(Math.min(4, 10));

        // Random 클래서
        Random r = new Random();
        System.out.println(r.nextInt(10)); // 0 이상 9 이하의 랜덤한 값

        // 10 이상 30 이하의 랜덤한 값
        int min = 10;
        int max = 30;
        System.out.println(r.nextInt(max - min) + 1 + min);
    }
}
