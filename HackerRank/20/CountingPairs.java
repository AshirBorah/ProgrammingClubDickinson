package lab03;

import java.util.Scanner;

public class CountingPairs {

	/**
	 * Counts the pairs for duplicates.  
	 * The pairs of duplicates is equal to the sum of number of duplicate and all positive integers of lesser value 
	 * 
	 * @param num,  the number of instances of a value
	 * @return number of pairs 
	 * 
	 */
	public static int pairsOfSelf (int num){
		if (num<=0){
			return 0;
		}
		return num+pairsOfSelf(num-1);
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int numVals = s.nextInt(); // The number of values

		int k = s.nextInt(); // The difference in pair that we are looking for

		int answer = 0; // The number of pairs of k difference (which we are
						// looking for... aka the answer)

		int max = 0; // Will be highest value inputed
		
		int[] nums = new int[numVals];
		
		//List all values inputed and find the max
		for (int i = 0; i < numVals; i++) {
			nums[i] =s.nextInt();
			//finds the max value
			if (nums[i]>max){	
				max=nums[i];
			}	
		}
		
		//Count of values inputed for 0-to-max value 
		int [] countPerNum = new int[max+1];  
		
		//Count the number of times each number appears
		for (int i= 0; i< nums.length;i++){
			countPerNum[nums[i]]++;
		}
		
		//There is a special case when k = 0;
		if (k!=0){
			
			//Calculate the number of pairs (Value_Count * K_Different_Value_Count) for each value.
			for (int i = 0; i< countPerNum.length-k;i++){
				answer+=countPerNum[i]*countPerNum[i+k];
			}
		}
		
		else{
			//When k = 0, each value is paired with very other duplicate of the same value.
			//Count the number of pairs with self for each value.
			for (int i = 0; i < max+1;i++){
				answer+=pairsOfSelf(countPerNum[i]-1);
			}	
		}
		
		System.out.println(answer);
	}
}
