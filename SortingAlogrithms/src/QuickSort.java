import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by anders on 11/14/2016.
 */import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by anders on 11/14/2016.
 */
public class QuickSort {

    private String finishedArray;
    private int pivot;
    private int mid;
    private String start;
    public ArrayList<Integer> mMaster = new ArrayList<>();
    Boolean first = true;

    public void quickSort(int[] array, int beg, int end) {
        if (beg >= end || array.length == 0) {
//          just leave the function if we have a problem with the input
            return;
        }

        int i = beg;
        int j = end;

//      right side from index 4, 4  + (6 -4)/2 = index 5 as a mid
        mid = beg + (end - beg) / 2;
        pivot = array[mid];

        while (i <= j) {
            /* aslong as the two indexes are on either side of the pivot, swap the values once we have found
                the j and i indexes that need to be changed. Swap them and increment i and decrement j so we move
                onto the next values. Once swapped call the method again with the new sorted array ranges. Once
                completed both the I and J ranges should provide clean sorted arrays.
            */
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swapIndexes(array, i, j);
                i++;j--;
            }
        }

        if (beg < j) {
            quickSort(array, beg, j);
        }
        if (end > i) {
            quickSort(array, i, end);
        }
        return;
    }

    public void swapIndexes(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        System.out.println("changed array[i] = array[j];" + array[i] + " " + array[j]);
    }
}
