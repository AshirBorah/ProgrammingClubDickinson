import java.util.Scanner;
// https://open.kattis.com/problems/threepowers
public class ThreePower {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			if (in.nextInt() == 0) {
				return;
			} else {
				int power = 0;
				int n = in.nextInt() - 1;
				while (n > 0) {
					if (n % 2 == 1) {
						System.out.println(3 ^ power);
					}
					n = n/2;
					power++;
				}
			}
		}
	}
}
 