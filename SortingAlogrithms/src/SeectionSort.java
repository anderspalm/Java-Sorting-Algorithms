/**
 * Created by ander on 11/8/2016.
 */
public class SeectionSort {

    public static void main(String a[]){

        int[] input = {10,34,2,56,7,67,88,42,2,13,432,21,123,4432,1223,4432,12213,212131,32132,13,21,321,32,13,21,21,3,213,21,32,324,
                14,32,431,24,321,4,321,4321,4,321,4,321,4,321,4,321,34,2,56,7,67,88,42,2,13,432,21,123};
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

        int[] bubbleOutput = bubbleSort(input);
        String total = "";
        for (int i : bubbleOutput){
            total += " " + i;
        }
        System.out.println(total);
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

}
