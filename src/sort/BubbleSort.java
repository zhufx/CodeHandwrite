package sort;

import java.util.Arrays;

/**
 * Created by zhufx on 2017/9/23.
 * Emai: it_zfx@126.com
 * Happy Life,Happy Coding
 */
public class BubbleSort {
    public int[] sort(int[] arr){
        int[] copy = Arrays.copyOf(arr,arr.length);
        bubbleSort(copy);
        return copy;
    }


    void  bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    SwapUtil.swap(arr,j,j+1);
                }
            }
        }
    }
}
