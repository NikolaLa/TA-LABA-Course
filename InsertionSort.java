public class InsertionSort {
    public static void main(String[] args) {
        //Insertion Sort
        //initial variable
        int[] array = {4, 15, 23, 3, 1, 2, 7, 19, 2, 6}; // for sorting
        int temp;
        //comparing and sorting

        for (int x = 1; x < array.length ; x++) { // loop one minus the size of array
            temp = array[x-1];
           for(int y = x ; y<array.length ;y++) {
               if(temp > array[y]){
                   temp = array[y];
                   array[y] =array[x-1];
                   array[x-1] = temp;
               }

           }
    }

        System.out.print(array);
}
}