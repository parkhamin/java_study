package Chapter01;

public class IfElse_Ex02 {
    public static void main(String[] args){
        int x = 10;
        int y = 1;

        if ( x != 10 || x % 2 != 0){ // or 연산자는 둘 다 false여야만 false!
            System.out.println(x);
        } else if ( y == 1){
            System.out.println(y);
        } else {
            System.out.println(x + y);
        }
    }
}
