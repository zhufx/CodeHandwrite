import sort.MergetSort;
import sort.QuickSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = Math.abs(new Random().nextInt()) % 10;
        }
        printArray(array,"原数组:");
        printArray(new MergetSort().MergeSort(array),"归并排序:");
        printArray(new QuickSort().quickSort(array),"快速排序:");
        Arrays.sort(array);
        printArray(array,"正确排序后数组:");
    }

    public static void printArray(int a[],String msg){
        StringBuilder sb = new StringBuilder();
        sb.append(msg);
        sb.append(Arrays.toString(a));
        System.out.println(sb);
    }

}
