package sort;

import java.util.Arrays;

/**
 * Created by zhufx on 2017/9/23.
 * Emai: it_zfx@126.com
 * Happy Life,Happy Coding
 */
public class InsertSort {
    public int[] sort(int[] arr){
        int[] copy = Arrays.copyOf(arr,arr.length);
        insertSort(copy);
        return copy;
    }


    void  insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j;
            for (j = i-1; j >= 0 && arr[j] > tmp ; j--){
                arr[j+1] = arr[j];
            }
            //注意这里
            arr[j+1] = tmp;
        }
    }
}
