package lab04;

import java.util.Scanner;

public class MazeSolver {

	private static char[][] maze;


	public static void printMaze() {

		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}

		// System.out.println("startX: "+ startX+" startY: "+ startY);
		// System.out.println("endX: "+ endX+" endY: "+ endY);

	}

	public static boolean solveMaze(int curX, int curY) {

		if (curX >= maze.length || curX < 0 || curY >= maze[curX].length || curY < 0 || maze[curX][curY] == 'X'
				|| maze[curX][curY] == '.') {
			return false;
		}

		if (maze[curX][curY] == 'E') {
			return true;
		}

		maze[curX][curY] = '.';
		if (solveMaze(curX + 1, curY)) {
			return true;
		}
		if (solveMaze(curX, curY + 1)) {
			return true;
		}
		if (solveMaze(curX - 1, curY)) {
			return true;
		}
		if (solveMaze(curX, curY - 1)) {
			return true;
		}

		maze[curX][curY] = ' ';

		return false;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String[] demensions = s.nextLine().split(",");

		int rows = Integer.parseInt(demensions[0]);

		// System.out.println(m+" "+n);

		maze = new char[rows][];
		
		boolean foundStart = false;
		int startX=-1;
		int startY=-1;
		
		for (int i = 0; i < maze.length; i++) {
			maze[i] = s.nextLine().toCharArray();
			if (!foundStart) {
				for (int j = 0; j < maze[i].length; j++) {
					if (maze[i][j] == 'S') {
						startX = i;
						startY = j;
						foundStart = true;
					}
				}
			}
		}

		maze[startX][startY] = ' ';

		if (solveMaze(startX, startY)) {
			maze[startX][startY] = 'S';
			printMaze();
		} else {
			System.out.println("No Solution!");
		}
		
	}
}
