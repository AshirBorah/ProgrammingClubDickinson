import java.io.*;
import java.util.*;

public class Solution {
    
    //Submitted by Jon Evans 2016
    //https://www.hackerrank.com/challenges/chocolate-feast?h_r=internal-search
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt() * 3;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = console.nextInt();
        }
        for (int i = 2; i < size; i += 3) {
            int money = arr[i-2];
            int price = arr[i-1];
            int wrapPrice = arr[i];
            int total = money / price;
            int wrappers = total;
            while (wrappers >= wrapPrice) {
                total += wrappers / wrapPrice;
                int remain = wrappers % wrapPrice;
                wrappers = (wrappers / wrapPrice) + remain;
            }
            System.out.println(total);
        }
    }
}