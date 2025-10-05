package Chapter01;

public class While {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;

        while (i <= 3){
            sum += i; // 1을 더함 1에 2를 더함 3에 3을 더함.
            // i++;
            i += 1; // 1 2 3 4가 되고 반복문 종료.
        }

        System.out.println(sum);
        System.out.println(i);
    }
}
