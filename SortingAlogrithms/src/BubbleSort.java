/**
 * Created by ander on 11/14/2016.
 */
public class BubbleSort {

    public int[] bubbleSort(int[] arr){

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
}
