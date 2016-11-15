import java.util.Scanner;

/**
 * Created by ander on 11/14/2016.
 */
public class LeftRotationArray {

    public static int temp;
    public static String finalArray;

    public static String arrayLeftRotation(int[] arrayInput, int total, int runs) {
        for (int i = 0; i < runs; i ++){
            finalArray = "";
            for(int j = 0; j < total; j ++){
                if(j > 0) {
                    int temp = arrayInput[j];
                    arrayInput[j] = arrayInput[j -1];
                    arrayInput[j -1] = temp;
                    if(i == (runs - 1)){
                        if(j < total - 1){
                            finalArray += (arrayInput[j - 1] + " ");
                        }
                        else{
                            finalArray += (arrayInput[j - 1] + " " + arrayInput[j]);
                        }
                    }
                }
                else {

                }
            }
        }
        return finalArray;
    }
}
