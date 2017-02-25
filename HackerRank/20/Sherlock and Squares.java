import java.io.*;
import java.util.*;

public class Solution {
    
    //Submitted by Jon Evans
    //https://www.hackerrank.com/challenges/sherlock-and-squares?h_r=internal-search
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = (console.nextInt() * 2);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = console.nextInt();
        }
        for (int i = 1; i < size; i+= 2) {
            int total = 0;
            int start = arr[i-1];
            int end = arr[i];
            start = (int) Math.ceil(Math.sqrt(start));
            end = (int) Math.floor(Math.sqrt(end));
            if (start == end) {
                total += 1;
            } else {
                total += end - start + 1;
            }
            System.out.println(total);
        }
    }
}

