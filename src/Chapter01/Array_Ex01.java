package Chapter01;

public class Array_Ex01 {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        /*int[] arr2 = arr1;

        arr1[0] = 100;
        System.out.println(arr2[0]);*/

        int[] arr2 = arr1.clone();

        arr1[0] = 100;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
    }
}
