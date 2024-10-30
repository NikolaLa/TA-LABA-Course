public class InsertionSort {
    public static void main(String[] args) {
        //Buble sort
        //initial variable
        int[] array = {4, 15, 23, 3, 1, 2, 7, 19, 2, 6}; // for sorting
        int temp = array[0];
        int[] sorted = {0};
        boolean once = true;
        //comparing and sorting

        for (int x = 1; x < array.length ; x++) { // loop one minus the size of array

            for (int y = 0; y < array.length-1; y++) { //searching for the smallest number in array
                if (temp > array[y + 1] && once == true) { // searching for first smallest number only once
                    temp = array[y+1];
                    if (array.length - 1 == y) {
                        once = false;
                    }
                }
                if (temp > array[y + 1] && sorted[x] < temp) { // if smaller than next comparison
                    temp = array[y];
                }
                if (y == array.length - 1) { // if larger swap
                    sorted[x] = temp;

                }
            }
        }
        System.out.println("the sorted numbers");
        for (int x = 0; x < sorted.length; x++) {
            System.out.println(sorted[x]);
        }
    }
}