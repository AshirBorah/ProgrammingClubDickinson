package MyProgram;

import java.util.LinkedList;
import java.util.Scanner;

public class Circular_Array_Rotation {

	public static void main(String[] args) {

		 Scanner in = new Scanner(System.in);
	        int arrSize = in.nextInt();
	        int numRotations = in.nextInt();
	        int numQuestions = in.nextInt();
	        LinkedList<Integer> arr = new LinkedList<Integer>();
	        for(int a_i=0; a_i < arrSize; a_i++){
	            arr.add(in.nextInt());
	        }
	        
	        for (int i = 0;i<numRotations;i++){
	        	int aux = arr.removeLast();
	        	arr.add(0, aux);
	        }
	        
	        
	        for(int a0 = 0; a0 < numQuestions; a0++){
	            int m = in.nextInt();
	            System.out.println(arr.get(m));
	        }
	}

}
