package Exam;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray){
        if(intArray.length < 2){
            return 0;
        }

        int min = intArray[0];
        int max = intArray[0];

        for (int i = 0; i< intArray.length-1; i++){
            if(max < intArray[i+1])
                max= intArray[i+1];

            if(min > intArray[i+1])
                min = intArray[i+1];
        }

        return max - min;
    }
}
