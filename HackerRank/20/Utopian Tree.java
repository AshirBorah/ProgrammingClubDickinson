import java.io.*;
import java.util.*;

public class Solution {
    
    //Submitted by Jon Evans 2016
    //https://www.hackerrank.com/challenges/utopian-tree?h_r=internal-search
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = console.nextInt();
        }
        for (int n = 0; n < size; n++) {
            int tree = 1;
            int num = 0;
            while (num < arr[n]) {
                if (num % 2 == 0 && num != 0) {
                    tree *= 2;
                    num++;
                } else {
                    tree += 1;
                    num++;
                }
            }
            System.out.println(tree);
        }
    }
}