public class BubleSort {
    public static void BubleSort(String[] args) {
        //Buble sort
        //array of numbers lets say 10 elements
        int[] array = {0,15,23,3,4,2,7,19,2,6};
        int[] temp ={};
        //comparing and sorting
        boolean[]finishSort = new boolean[array.length]; // create array of boolean default falsa value interesting I don't do a loop here
        while(true) //start at least once
        {
            for(int x =0; x < array.length - 1; x++ ) // loop one minus the size of array
            {
                if(array[x] > array[x+1] ) { // if smaller than next switch places
                    //temp[x];
                }
            }

        }

    }
}