/**
 * Created by ander on 11/8/2016.
 */
public class SeectionSort {

    public static void main(String a[]){

        int[] input = {10,9,8,7,6,5,4,3,2,1,11,12,13,14,15,16,17,18,19,20};


        System.out.println("Selection");
        int[] seletionOutput = doSelectionSort(input);
        for(int i = 0; i < seletionOutput.length; i ++){
            if (i < input.length - 1) {
                System.out.print(seletionOutput[i] + ", ");
            }
            else {
                System.out.print(seletionOutput[i] + ".");
            }
        }

        System.out.println("-----------------------------------------------");
        System.out.println("bubble");
        int[] bubbleOutput = bubbleSort(input);
        for(int i = 0; i < bubbleOutput.length; i ++){
            if (i < input.length - 1) {
                System.out.print(bubbleOutput[i] + ", ");
            }
            else {
                System.out.print(bubbleOutput[i] + ".");
            }
        }

        System.out.println("-----------------------------------------------");
        System.out.println("insertion");
        int[] insertionOutput = insertionSort(input);
        for(int i = 0; i < insertionOutput.length; i ++){
            if (i < input.length - 1) {
                System.out.print(insertionOutput[i] + ", ");
            }
            else {
                System.out.print(insertionOutput[i] + ".");
            }
        }

        System.out.println("-----------------------------------------------");
        System.out.println("quickSort");
        int[] quickSort = quickSort(input, 0, input.length - 1);
//        for(int i = 0; i < quickSort.length; i ++){
//            if (i < input.length - 1) {
//                System.out.print(quickSort[i] + ", ");
//            }
//            else {
//                System.out.print(quickSort[i] + ".");
//            }
//        }
    }

    public static int[] doSelectionSort(int[] arr){

        for(int i = 0; i < arr.length; i++){

            int smallest = i;
            for(int j = i + 1; j < arr.length; j ++ ){
                if (arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
            int smallestNum = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = smallestNum;

        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr){

        int temp = 0;
        for (int i = 1; i < arr.length; i++){

            if(arr[i -1] > arr[i]){
                temp = arr[i];
                arr[i] = arr[i -1];
                arr[i -1] = temp;
            }

        }

        return arr;
    }

    public static int[] insertionSort(int[] arr){
     int temp = 0;
        for(int i = 1; i < arr.length; i ++){
            for(int j = i; j > 0; j --) {
                if(arr[j] < arr[j -1]){
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] quickSort(int[] array, int beg, int end) {
        int i = beg;
        int j = end;
        int pivot = 0;
        if (end - beg >= 0){
            pivot = array[end]; // is makes no difference if the pivot is at the beginning or end to the physical outcome
            while (j >= i) {
                while (array[i] <= pivot && i <= end && j > i) {i++;} // count up until a value is smaller than the pivot.
                while (array[j] > pivot && j >= beg && j >= i) {j--;} // count down until a value is larger than the pivot.
                if (j > i) {
                    swapIndexes(array, i, j);
                    // as long as the new end index is larger than the new start swap the values
                }
                else {}
//                System.out.println(" i " + array[i] + " " + " j " + array[j]);
                System.out.println("-------------------------------------------------");
                for(int k = 0; i < array.length; i ++){
                    if (i < array.length - 1) {
                        System.out.print(array[i] + ", ");
                    }
                    else {
                        System.out.print(array[i] + ".");
                    }
                }
            }
            quickSort(array, beg, j - 1); // restart the process with the new left-hand range
            quickSort(array, j + 1, end); // restart with the new right-hand range
        }
        return array; // once there are no unsorted items return the finished array
    }

    public static void swapIndexes(int[] array, int i, int j){
//      below is a staple index value swap
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
