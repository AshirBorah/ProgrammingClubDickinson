package lab05;

import java.util.Scanner;

/**
 * 
 * This class solves the Warring Heirs problem.
 * 
 * @author cameronsimmons
 * @author Connor Ford
 * url: http://users.dickinson.edu/~hugginsk/courses/2017_spring/cs232s17/labs/lab05.html
 */
public class WarringHeirs {

	/**
	 * Simply returns a copy of the board
	 * 
	 * @param board,
	 *            the that is being copied
	 * @return a new copy of the board
	 */
	public static int[][] copyBoard(int[][] board) {
		int[][] newBoard = new int[board.length][board[0].length]; // The copy
																	// of the
																	// board
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[0].length; c++) {
				newBoard[r][c] = board[r][c];
			}
		}
		return newBoard;
	}

	/**
	 * For all territories, 'attack' surroundings.
	 * 
	 * @param initBoard,
	 *            state of board before battles
	 * @param bBoard,
	 *            state of board during/after battles
	 * @param numSons,
	 *            number of sons
	 */
	public static void battle(int[][] initBoard, int[][] bBoard, int numSons) {

		for (int r = 0; r < initBoard.length; r++) {
			for (int c = 0; c < initBoard[0].length; c++) {
				
				attack(r + 1, c, initBoard[r][c], initBoard, bBoard, numSons);// attack
																				// up
				attack(r - 1, c, initBoard[r][c], initBoard, bBoard, numSons);// attack
																				// down
				attack(r, c + 1, initBoard[r][c], initBoard, bBoard, numSons);// attack
																				// right
				attack(r, c - 1, initBoard[r][c], initBoard, bBoard, numSons);// attack
																				// left
				
			}
		}

	}

	/**
	 * 
	 * If the attacker attacks an enemy (+1val or max to min), the attacker
	 * takes that territory.
	 * 
	 * @param row,
	 *            row of territory being attacked
	 * @param col,
	 *            column of territory being attacked
	 * @param attackerVal,
	 *            value of territory attacking
	 * @param initBoard,state
	 *            of board before battles
	 * @param bBoard,state
	 *            of board during/after battles
	 * @param numSons,
	 *            number of sons
	 */
	public static void attack(int row, int col, int attackerVal, int[][] initBoard, int[][] bBoard, int numSons) {

		if (row < initBoard.length && row >= 0 && col < initBoard[0].length && col >= 0) { // ensure
																							// bounds
			// Case: attacker is max value
			if (attackerVal + 1 == numSons && initBoard[row][col] == 0) {
				bBoard[row][col] = attackerVal;
			} else {
				// Take over enemy
				if (initBoard[row][col] == attackerVal + 1) {
					bBoard[row][col] = attackerVal;
				}
			}
		}
	}

	/**
	 * Reveal the board
	 * 
	 * @param board,
	 *            board to be printed
	 */
	public static void printBoard(int[][] board) {
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[0].length; c++) {
				System.out.print(board[r][c]);
				if (c != board[r].length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int numSons = s.nextInt(); // number of sons
		int rows = s.nextInt(); // number of rows of kingdom
		int cols = s.nextInt();// number of columns of kingdom
		int numBattles = s.nextInt(); // number of battles that take place
		int[][] initBoard = new int[rows][cols]; // state of kingdom before
													// battle
		
		// build kingdom
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				initBoard[i][j] = s.nextInt();
			}
		}

		
		// Let the battles commence....
		for (int i = 0; i < numBattles; i++) {
			int[][] bBoard = copyBoard(initBoard); // battle board
			battle(initBoard, bBoard, numSons);
			initBoard = bBoard;
			//System.out.println();
			//printBoard(initBoard);
		}
		System.out.println();
		// show outcome
		printBoard(initBoard);

	}
}
