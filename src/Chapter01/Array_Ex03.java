package Chapter01;

public class Array_Ex03 {
    public static void main(String[] args){
        int[] intArray = new int[30];

        for(int i=1; i<= intArray.length; i++){
            intArray[i-1] = i + 1000;
        }

        String[] remainders = {"Zero", "One", "Two", "Three"};

        /* 내가 오류냈던 구문
        for(int i: intArray){ // intArray[i]는 하나의 원소, 즉 i와 같음
            System.out.println(remainders[intArray[i]%4]);
        }*/

        for (int i: intArray)
            System.out.println(remainders[i%4]);
    }
}
