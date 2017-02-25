package HackerRank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Megaprime {
	
	
	private static String generate (char[] c, String prefix, long length, ArrayList<String> val){
		if(length == 0 ){
			val.add(prefix);
			return prefix;
		}else{
			String result = "";
			for(int i = 0; i < c.length; i++){
				result = result + generate(c, prefix + c[i],length-1,val);
			}
			return result;
		}
	}
	public static void main(String [] args){
		Scanner key = new Scanner (System.in );
		String first = key.next();
		String second = key.next();
		long count = 0;
		
		String str = new String();
		ArrayList<String>val = new ArrayList<String>();
		char[] c= {'2','3','5','7'};
		for(int i = first.length(); i<= second.length(); i++){
			generate(c,str,i,val);
		}
//		System.out.println(val);
		BigInteger f = new BigInteger(first);
		BigInteger s = new BigInteger(second);
		for(int i = 0; i < val.size(); i++){
			BigInteger nr = new BigInteger(val.get(i));
			if(nr.compareTo(f)>= 0 && nr.compareTo(s) <= 0 ){
				if(nr.isProbablePrime(1)){
					System.out.println(nr);
					count++;
				}
				}
			}
		
			
		
	
		System.out.println(count);
	}
}

