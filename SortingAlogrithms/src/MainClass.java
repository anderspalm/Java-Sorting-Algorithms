import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ander on 11/8/2016.
 */
public class MainClass {

    public static void main(String a[]){

        int[] input = {10,5,2,1,3,9,7,6,11};

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
//        int[] array = new int[n];
//        for(int i = 0; i < n; i++){
//            array[i] = in.nextInt();
//        }

//        LeftRotationArray lRA = new LeftRotationArray();
//        System.out.println("\nLeftRotationArray");
//        System.out.println(lRA.arrayLeftRotation(array,n,k));
//
//
//        System.out.println("\nSelection");
//        SelectionSort selectionSort = new SelectionSort();
//        int[] seletionOutput = selectionSort.doSelectionSort(input);
//        for(int i = 0; i < seletionOutput.length; i ++){
//            if (i < input.length - 1) {
//                System.out.print(seletionOutput[i] + ", ");
//            }
//            else {
//                System.out.print(seletionOutput[i] + ".");
//            }
//        }
//
//        System.out.println("\nbubble");
//        BubbleSort bBSort = new BubbleSort();
//        int[] bubbleOutput = bBSort.bubbleSort(input);
//        for(int i = 0; i < bubbleOutput.length; i ++){
//            if (i < input.length - 1) {
//                System.out.print(bubbleOutput[i] + ", ");
//            }
//            else {
//                System.out.print(bubbleOutput[i] + ".");
//            }
//        }
//
//        System.out.println("\ninsertion");
//        InsertionSort iSort = new InsertionSort();
//        int[] insertionOutput = iSort.insertionSort(input);
//        for(int i = 0; i < insertionOutput.length; i ++){
//            if (i < input.length - 1) {
//                System.out.print(insertionOutput[i] + ", ");
//            }
//            else {
//                System.out.print(insertionOutput[i] + ".");
//            }
//        }

        System.out.println("\nquickSort");
        QuickSort qSort = new QuickSort();
        int[] inputQuickSort = {3,7,2,6,9};
        qSort.quicksortEndPivot(inputQuickSort,0,inputQuickSort.length-1);
        System.out.println(Arrays.toString(inputQuickSort));
    }

}
