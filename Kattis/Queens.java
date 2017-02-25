import java.util.Scanner;
// https://open.kattis.com/problems/queens
public class Queens {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] board = new int[n][2];
		for (int i = 0; i < n; i++) {
			board[i][0] = in.nextInt();
			board[i][1] = in.nextInt();
 		}
		boolean cond = true;
		for (int j = 0; j < n; j++) {
			for (int k = n-1; k > j; k--) {
				if (board[j][0] == board[k][0] || board[j][1] == board[k][1] || board[j][0] + board[j][1] == board[k][0] + board[k][1] || board[j][0] - board[j][1] == board[k][0] - board[k][1]) {
					cond = false;
				}
			}
		}
		if (cond) {
			System.out.println("CORRECT");
		} else {
			System.out.println("INCORRECT");
		}
	}
}
