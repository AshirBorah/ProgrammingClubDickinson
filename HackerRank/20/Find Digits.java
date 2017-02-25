import java.io.*;
import java.util.*;

public class Solution {
    
    //Submitted by Jon Evans 2016
    //https://www.hackerrank.com/challenges/find-digits?h_r=internal-search
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = console.nextInt();
        }
        for (int n = 0; n < arr.length; n++) {
            String str = Integer.toString(arr[n]);
            int total = 0;
            for (int j = 0; j < str.length(); j++) {
                int num = Character.getNumericValue(str.charAt(j));
                if (num != 0) {
                    if (arr[n] % num == 0) {
                        total++;
                    }
                }
            }
            System.out.println(total);
        }
    }
}