/**
 * Created by ander on 11/14/2016.
 */
public class SelectionSort {

    public int[] doSelectionSort(int[] arr){

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
}
