package sort;

import org.omg.CORBA.INTERNAL;

import java.util.Arrays;

/**
 * Created by zhufx on 2017/9/23.
 * Emai: it_zfx@126.com
 * Happy Life,Happy Coding
 */
public class SelectSort {
    public int[] sort(int[] arr){
        int[] copy = Arrays.copyOf(arr,arr.length);
        selectSort(copy);
        return copy;
    }


    void  selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(min > arr[j]){
                    minIndex = j;
                    min = arr[j];
                }
            }
            SwapUtil.swap(arr,minIndex,i);
        }
    }
}
