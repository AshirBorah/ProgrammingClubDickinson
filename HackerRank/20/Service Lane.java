import java.io.*;
import java.util.*;

public class Solution {
    
    //Submitted by Jon Evans 2016
    //https://www.hackerrank.com/challenges/service-lane?h_r=internal-search
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int tests = console.nextInt();
        int[] lanes = new int[size];
        int[] trial = new int[tests * 2];
        for (int i = 0; i < size; i++) {
            lanes[i] = console.nextInt();
        }
        for (int j = 0; j < trial.length; j++) {
            trial[j] = console.nextInt();
        }
        for (int i = 1; i < tests * 2; i += 2) {
            int entry = trial[i-1];
            int exit = trial[i];
            int cur = 3;
            for (int j = entry; j <= exit; j++) {
                if (lanes[j] < cur) {
                    cur = lanes[j];
                }
            }
            System.out.println(cur);
        }
        
    }
}