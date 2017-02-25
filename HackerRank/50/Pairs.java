import java.io.*;
import java.util.*;
/*
@Author: Ashir Borah
url: https://www.hackerrank.com/challenges/pairs
*/
public class Solution {

  public static void main(String[] args) {
    HashMap<Integer, Integer> map=new HashMap();
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    for(int i=0;i<n;i++){
      int num=in.nextInt();
      if(map.containsKey(num)){
        map.put(new Integer(num),new Integer(map.get(num))+1);
      }else{
        map.put(new Integer(num),new Integer(1));
      }
    }
    long total=0;
    for(Integer x:map.keySet()){
      if(k==0){
        total+=x*(x-1);
      }else{
        if(map.containsKey(x+k)){
          total+=map.get(x)*map.get(x+k);
        }
      }
    }
    System.out.println(total);
  }
}
