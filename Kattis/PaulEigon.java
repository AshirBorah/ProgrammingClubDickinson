import java.util.Scanner;
//https://open.kattis.com/problems/pauleigon
public class PaulEigon {

	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		int q = in.nextInt();
		if (((p + q)/n)%2 == 1) {
			System.out.println("opponent");
		} else {
			System.out.println("paul");
		}
	}
}
