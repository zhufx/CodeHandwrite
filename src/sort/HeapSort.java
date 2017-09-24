package sort;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

/**
 * Created by zhufx on 2017/9/23.
 * Emai: it_zfx@126.com
 * Happy Life,Happy Coding
 */
public class HeapSort {


    public int[] sort(int[] arr){
        int[] copy = Arrays.copyOf(arr,arr.length);
        heapSort(copy);
        return copy;
    }

    public void heapSort(int[] arr){
        buildMaxHeap(arr);
        for (int i = arr.length-1; i >= 1; i--) {
            SwapUtil.swap(arr,0,i);
            maxHaepify(arr,0,i);
        }
    }

    public void buildMaxHeap(int[] arr){
        for (int i = arr.length/2; i >= 0 ; i--) {
            maxHaepify(arr,i,arr.length);
        }
    }


    public void maxHaepify(int[] arr,int i,int heapSize){
        int l = 2*i+1;
        int r = l + 1;
        int largest = i;
        if( l < heapSize && arr[i] < arr[l])  largest = l;
        if( r < heapSize && arr[largest] < arr[r])  largest = r;
        if(largest != i)
        {
            SwapUtil.swap(arr,largest,i);
            maxHaepify(arr,largest,heapSize);
        }
    }

}
