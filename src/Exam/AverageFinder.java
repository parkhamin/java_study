package Exam;

public class AverageFinder {
    double computeAverage(int[] intArray){
        int sum = 0;
        double average = 0;

        for(int num: intArray)
            sum += sum + num;

        return (double)sum / intArray.length;

    }
}
