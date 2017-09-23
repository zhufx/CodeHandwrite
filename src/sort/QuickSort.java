package sort;

import java.util.Arrays;

/**
 * Created by zhufx on 2017/9/23.
 * Emai: it_zfx@126.com
 * Happy Life,Happy Coding
 */
public class QuickSort {
    public static void main(String[] args){
        int[] arr = new int[]{0};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] quickSort(int[] arr){
        int[] copy = Arrays.copyOf(arr,arr.length);
        quickSort(copy,0,copy.length-1);
        return copy;
    }

    public static void quickSort(int[] arr,int l,int r){
        if(l < r){
            int p = partition(arr,l,r);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,r);
        }
    }

    public static int partition(int[] arr,int l,int r){
        int x = arr[l];
        while ( l < r){
            //这里出过错
            for (;l<r && arr[r] >= x;r--);
            if(l<r) arr[l++] = arr[r];
            for (;l<r && arr[l] < x;l++);
            if(l<r) arr[r--] = arr[l];
        }
        arr[l] = x;
        return l;
    }



}
