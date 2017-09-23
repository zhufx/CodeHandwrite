package sort;

import java.util.Arrays;

/**
 * Created by zhufx on 2017/9/23.
 * Emai: it_zfx@126.com
 * Happy Life,Happy Coding
 */
public class MergetSort {
    public int[] MergeSort(int[] arr){
        int[] copy = Arrays.copyOf(arr,arr.length);
        sort(copy,0,copy.length-1);
        return copy;
    }

    public void merge(int[] arr,int l,int mid,int r){
        int k = 0;
        int i = l;
        //这里出过错
        int j = mid+1;
        int[] tmp = new int[r-l+1];
        while (i<=mid && j<=r){
            if(arr[i] < arr[j]) tmp[k++] = arr[i++];
            else tmp[k++] = arr[j++];
        }
        while (i<=mid){
            tmp[k++] = arr[i++];
        }
        while (j<=r){
            tmp[k++] =arr[j++];
        }
        for (int m = 0; m < tmp.length; m++) {
            //这里出过错arr[1+m] = tmp[m]
            arr[l+m] = tmp[m];
        }
    }

    public void sort(int[] arr,int l,int r){
        if(l < r){
            int mid = (l+r)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
}
