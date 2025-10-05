package Chapter01;

public class Array_Ex02 {
    public static void main(String[] args){
        String[] fruitsArray = new String[5];

        fruitsArray[0] = "딸기";
        fruitsArray[1] = "당근";
        fruitsArray[2] = "수박";
        fruitsArray[3] = "참외";
        fruitsArray[4] = "멜론";

        /*for (int i =0; i< fruitsArray.length; i++){
            System.out.println(fruitsArray[i]);
        }*/

        for (String i : fruitsArray)
            System.out.println(i);
    }
}
