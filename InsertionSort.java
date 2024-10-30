public class InsertionSort {
    public static void main(String[] args) {
        //Insertion Sort
        //initial variable
        int[] array = {4, 15, 23, 3, 1, 2, 7, 19, 2, 6}; // for sorting
        int temp;
        int[] sorted = new int[array.length];
        boolean once = true;
        //comparing and sorting

        for (int x = 1; x < array.length -1 ; x++) { // loop one minus the size of array
            temp = array[0];
            for (int y = 0; y < array.length-1; y++) { //searching for the smallest number in array

                if (temp > array[y + 1]) { // if smaller than next comparison
                    temp = array[y + 1];
                }
            }
            int[] newArray = new int[array.length-1];

            for(int z =0, y=0; z < array.length;z++) { //deleting the smallest number from array

                if( array[z]!=temp)
                {
                    newArray[y] = array[z];
                    y++;
                }

            }
            array = newArray;
            sorted[x-1] = temp;
        }
        System.out.println("the sorted numbers");
        for (int x = 0; x < sorted.length; x++) {
            System.out.println(sorted[x]);
        }
    }
}