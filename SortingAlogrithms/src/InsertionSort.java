/**
 * Created by ander on 11/14/2016.
 */
public class InsertionSort {
    public int[] insertionSort(int[] arr){
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
}
