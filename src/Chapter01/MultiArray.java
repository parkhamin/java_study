package Chapter01;

public class MultiArray {
    public static void main(String[] args){
        int[][] multiArray = new int[3][4];

        for (int i=0; i< multiArray.length; i++){
            for (int j=0; j< multiArray[i].length; j++){
                multiArray[i][j] = (i * 4 + 1) + j;
                System.out.println(multiArray[i][j]);
            }
        }
    }
}
