package Chapter01;

// 변수 하나에 값 하나만 저장했었지만 배열은 변수 하나에 여러 개의 값을 저장 가능함.

public class Array {
    public static void main(String[] args){
        int[] intArray = new int[5];

        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 5;
        intArray[3] = 7;
        intArray[4] = 11;

        //System.out.println(intArray[2] + intArray[4]);
        /*for (int i=0; i< intArray.length; i++){
            System.out.println(intArray[i]);
        }*/
        for (int j: intArray)
            System.out.println(j);
    }
}
