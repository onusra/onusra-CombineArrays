import java.util.*;
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public static void main(String [] args){

    }
    public int[] combine(int[] arr1, int[] arr2){
       int arr3[] = new int[(arr1.length ) + (arr2.length)];
       for(int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
       }
       int size = arr1.length;
       for(int i = 0; i < arr2.length; i++){
            arr3[size + i] = arr2[i];
       }
        return arr3;
    }
}
