/*
 * @author Nikola Lauer
 * @version 1.10 31 Oct 2024
 *
 * Test Project Sorting algorytm nr3 from first assigment for Course
 * Insertion Sort
 */

public class InsertionSort {
    public static void main(String[] args) {
        //initial variable
        int[] array = {4, 15, 23, 3, 1, 2, 7, 19, 2, 6}; // array sample for sorting
        int temp;

        //comparing and sorting
        for (int x = 1; x < array.length ; x++) { // loop for the length of array and swaps for the smallest
            temp = array[x-1];
           for (int y = x ; y < array.length ;y++) {
               if (temp > array[y]){
                   temp = array[y];
                   array[y] = array[x-1];
                   array[x-1] = temp;
               }

           }
        }
    }
}