package sort;

import java.util.Arrays;

/**
 * Created by zhufx on 2017/9/23.
 * Emai: it_zfx@126.com
 * Happy Life,Happy Coding
 */
public class CountSort {
    public int[] sort(int[] arr){
        int[] copy = Arrays.copyOf(arr,arr.length);
        return countSort(copy);
    }


    int[] countSort(int[] a){
        int[] b = new int[a.length];
        int[] c = new int[1000];
        for (int i = 0; i < a.length; i++) {
            int tmp = a[i];
            c[tmp] = c[tmp] + 1;
        }
        for (int i = 1; i < c.length; i++) {
            c[i] = c[i]+c[i-1];
        }
        for (int i = 0; i < a.length; i++) {
            b[c[a[i]]-1] = a[i];
            c[a[i]]--;
        }
        return b;
    }
}
