import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Collections;

public class ArraysTasks {

    public void evenArray (){
        Integer[] array = new Integer[49]; // В диапазоне от 0 до 100 50 четных чисел, а значит до 99 их 49.
                                   // Если бы передавли диапазон значений то размер бы массива был (int)(Math.ceil(interval/2)-1)
        int count = 0;
        for (int i = 0; i < 99 ; i++) {
            if(i%2 == 0 && i != 0) {
                array[count] = i;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array) + "\n");
    }

    public void randomArray(){
        Integer[] array = new Integer[20];
        int countOne = 0, countTwo = 0;
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int)(Math.random()*10);
            if (array[i]%2 == 0 && array[i] != 0) {
                countOne++;
            }
            else countTwo++;
        }
        System.out.println(Arrays.toString(array) + " Even: " + countOne + " Non even: " + countTwo + "\n");
    }

    public void changeArray(){
        Integer[] array = new Integer[10];
        String str= "[";
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) (Math.random() * 100);
            if (i <array.length - 1) { str += array[i] + ", "; }
            else { str += array[i]; }
            if (i%2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(str + "]");
        System.out.println(Arrays.toString(array) + "\n");
    }

    public void minMaxArray(){
        int[] array = new int[15];
        int minIndex = 0, maxIndex = 0;
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) (-50 + Math.random() * 100);
        }
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == min) minIndex = i;
            else if (array[i] == max) maxIndex = i;
        }
        System.out.println(Arrays.toString(array) + " min = " + min + " (" + (minIndex + 1) + ") max = " + max  + " (" + (maxIndex + 1) + ")" + "\n");
    }

    public void averageArray(){
        int[] arrayOne = new int[10], arrayTwo = new int[10];
        for (int i = 0; i < arrayOne.length ; i++) {
            arrayOne[i] = (int) (Math.random() * 10);
            arrayTwo[i] = (int) (Math.random() * 10);
        }
        double averageOne = Arrays.stream(arrayOne).sum()/10.0;
        double averageTwo = Arrays.stream(arrayTwo).sum()/10.0;
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        if (averageOne > averageTwo) System.out.println("Average one(" + averageOne + ") > average two(" + averageTwo + ")" + "\n");
        else if (averageTwo > averageOne) System.out.println("Average two(" + averageTwo + ") > average one(" + averageOne + ")" + "\n");
        else System.out.println("Average one(" + averageOne + ") = average two(" + averageTwo + ")" + "\n");
    }

    public void searchArray(){
        int[] array = new int[20];
        int count[] = new int[20];
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) (-10 + Math.random() * 20);
        }
        System.out.println(Arrays.toString(array) + "\n");
        for (int i = 0; i <array.length; i++) {
            count[i]=0;
            for (int j = i ; j<array.length; j++) {
                if(array[i] ==array[j]) {
                    count[i]++;
                }
            }
        }
        int max = Arrays.stream(count).max().getAsInt();
        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                System.out.println("Элемент " + array[i] + " повторяется " + count[i] + " раз\n");
            }
        }


    }
}
