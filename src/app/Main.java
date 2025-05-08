package app;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayUtils arrayUtils = new ArrayUtils();

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Початковий вигляд масиву: " + Arrays.toString(array));

        arrayUtils.mergeSort(array);

        System.out.println("Масив після сортування:   " + Arrays.toString(array));

        int target = 8;
        int result = arrayUtils.binarySearch(array, target);

        if (result != -1) {
            System.out.println("Значення " + target + " знайдено за індексом " + result);
        } else {
            System.out.println("Значення " + target + " не знайдено в масиві");
        }


    }
}
