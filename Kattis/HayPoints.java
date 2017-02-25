import java.util.Scanner;
// https://open.kattis.com/problems/haypoints
public class HayPoints {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		String[][] list = new String[m][2];
		for (int i= 0; i < m; i++) {
			list[i][0] = sc.next();
			list[i][1] = sc.next();
 		}
		sc.nextLine();
				
		String str = ""; 
		while (sc.hasNext()) {
			str = str + " " + sc.next();
		}
		str = str + " .";
		
		String[] des = new String[n];
		int start = 0;
		int end = str.indexOf(".", 0);
		for (int i = 0; i < n; i++) {
			des[i] = str.substring(start, end);
			start = str.indexOf(".", start) + 1;
			end = str.indexOf(".", start);
		}

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < m; j++) {
				if (des[i].contains(list[j][0])){
					count = count + Integer.parseInt(list[j][1]);
				}
			}
			System.out.println(count);
		}
	}

}
