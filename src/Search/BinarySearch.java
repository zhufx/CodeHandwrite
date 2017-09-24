package Search;

/**
 * Created by zhufx on 2017/9/23.
 * Emai: it_zfx@126.com
 * Happy Life,Happy Coding
 */
public class BinarySearch {
    public int BinarySearch(int[] arr,int target){
        int l = 0;
        int r = arr.length-1;
        //记住这里是小于等于
        while (l<=r){
            int m = (l-r)/2 + r;
            if (arr[m] == target)   return m;
            else if(arr[m] <target)  l = m+1;
            else r = m-1;
        }
        return -1;
    }
}
