package Search;

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
            array[i] = Math.abs(new Random().nextInt()) % 20;
        }
        Arrays.sort(array);
        for (int i = 0; i < 5; i++) {
            int k = Math.abs(new Random().nextInt() % 20);
            System.out.println("数组为" + Arrays.toString(array) + " 查询的值是：" + k);
            System.out.println("结果是" + new BinarySearch().BinarySearch(array,k));
        }
    }

    public static void printArray(int a[],String msg){
        StringBuilder sb = new StringBuilder();
        sb.append(msg);
        sb.append(Arrays.toString(a));
        System.out.println(sb);
    }

}
