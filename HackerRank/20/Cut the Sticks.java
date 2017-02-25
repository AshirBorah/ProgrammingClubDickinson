import java.io.*;
import java.util.*;

public class Solution {

    //Submitted by Jon Evans 2016
    //https://www.hackerrank.com/challenges/cut-the-sticks?h_r=internal-search
    
    public static int findZero(int[] arr) {
        int num = 0;
        while (num < arr.length && arr[num] <= 0) {
            num++;
        }
        return num;
    }
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = console.nextInt();
        }
        Arrays.sort(arr);
        int num = Solution.findZero(arr);
        int cut = arr[num];
        while (num != arr.length) {
            System.out.println(arr.length - num);
            for (int i = num; i < arr.length; i++) {
                arr[i] = arr[i] - cut;
                //System.out.println(arr[i]);
            }
            num = Solution.findZero(arr);
            cut = arr[num];
        }
    }
}
