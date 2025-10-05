package Chapter01;

// 1, 2, 3, ...을 하나씩 더한 값이 10000보다 크거나 같아졌을 때, 마지막으로 더한 값(i)은 무엇일까요?
public class While_Ex01 {
    public static void main(String[] args){
        int sum = 0, i = 1;

        /*while(sum <= 10000){
            sum += i;
            i++;
        }*/

        while (true){
            if (sum >= 10000) break;

            sum += i;
            i++;
        }

        System.out.println(sum);
        System.out.println(i-1);
    }
}
