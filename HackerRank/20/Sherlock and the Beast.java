import java.io.*;
import java.util.*;

public class Solution {

    //Submitted by Jon Evans 2016
    //https://www.hackerrank.com/challenges/sherlock-and-the-beast?h_r=internal-search
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int t = console.nextInt();
        int count = 0;
        int[] arr = new int[t];
        while (console.hasNext()) {
            arr[count] = console.nextInt();
            count++;
        }
        for (int i = 0; i < t; i++) {
            int num = arr[i];
            if (arr[i] <= 2) {
                System.out.println(-1);
            } else {
                if (arr[i] % 3 == 0) {
                    while (num != 0) {
                        System.out.print("5");
                        num--;
                    }
                    System.out.println(" ");
                } else if ((arr[i] - 5) % 3 == 0 && arr[i] - 5 > 2) {
                    int place = 5;
                    int newNum = num - 5;
                    while (newNum != 0) {
                        System.out.print("5");
                        newNum--;
                    }
                    while (place != 0) {
                        System.out.print("3");
                        place--;
                    }
                    System.out.println(" ");
                }  else if ((arr[i] - 10) % 3 == 0 && arr[i] - 10 > 2) {
                    int place = 10;
                    int newNum = num - 10;
                    while (newNum != 0) {
                        System.out.print("5");
                        newNum--;
                    }
                    while (place != 0) {
                        System.out.print("3");
                        place--;
                    }
                    System.out.println(" ");
                } else if (arr[i] % 5 == 0) {
                    while (num != 0) {
                        System.out.print("3");
                        num--;
                    }
                    System.out.println(" ");
                } else {
                    System.out.println("-1");
                }
            }
        }
    }
}