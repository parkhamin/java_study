package Chapter01;

// 10000 미만의 정수 중에서, 153의 배수 중 가장 큰 값을 찾아 출력하세요.

public class While_Ex02 {
    public static void main(String[] args){
        int num = 10000;
        int key = 153;
        int i = 1;
        /*1. 나의 비효율적인 방법
        while(key * i < num){
            i++;
        }

        System.out.println(key * (i-1)); // 반복문이 종료되었다는 것은 그 i가 10000을 넘게 했으므로 1 감소.*/

        //2. 정석
        while(num % key > 0){
            num--;
        }
        System.out.println(num);
    }
}
