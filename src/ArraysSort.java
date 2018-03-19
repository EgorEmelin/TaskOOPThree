import java.util.Arrays;

public class ArraysSort {

    public int[] arraysCreation(int size, int seed, int maxValue){
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = seed + (int)(Math.random() * maxValue);
        }
        return array;
    }

    public void sort(int size, int seed, int maxValue){
        int [] array = arraysCreation(size,seed,maxValue);
        int [] tempArrayOne = array,
                tempArrayTwo = array;
        System.out.println(Arrays.toString(array));

        long startTime = System.nanoTime();
        for (int i = tempArrayOne.length -1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if (tempArrayOne[j]>tempArrayOne[j+1]){
                    int temp = tempArrayOne[j];
                    tempArrayOne[j] = tempArrayOne[j+1];
                    tempArrayOne[j+1] = temp;
                }
            }
        }
        long finalTime = System.nanoTime() - startTime;
        System.out.println(Arrays.toString(tempArrayOne) + "   Time of execution: " + finalTime);

        startTime = System.nanoTime();
        for (int i = 0; i < tempArrayTwo.length; i++){
            int min = tempArrayTwo[i];
            int minIndex = i;
            for(int j = i + 1; j < tempArrayTwo.length; j++) {
                if (tempArrayTwo[j] < min) {
                    min = tempArrayTwo[j];
                    minIndex = j;
                }
            }
            if (i != minIndex){
                int temp = tempArrayTwo[i];
                tempArrayTwo[i] = tempArrayTwo[minIndex];
                tempArrayTwo[minIndex] = temp;
            }
        }
        finalTime = System.nanoTime() - startTime;
        System.out.println(Arrays.toString(tempArrayTwo) + "   Time of execution: " + finalTime);

        startTime = System.nanoTime();
        Arrays.sort(array);
        finalTime = System.nanoTime() - startTime;
        System.out.println(Arrays.toString(array) + "   Time of execution: " + finalTime);
    }
}

