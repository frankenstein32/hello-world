
import java.util.Scanner;

/**
 * @author RASHID
 *
 * @date May 30, 2018
 */

public class Rhombus {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

	int n = scn.nextInt();
	System.out.println(NQueensC(new int[n][n],0));
	NQueens(new int[n][n], 0,"");
		

	}


	public static void NQueens(boolean[][] board, int row, String asf) {

		if (row == board.length) {
			System.out.print(asf + "  ");
			return;
		}

		for (int col = 0; col < board[0].length; col++) {

			if (isItSafeToPlaceQueen(board, row, col)) {
				board[row][col] = true;
				NQueens(board, row + 1, asf + "{" + (row + 1) + "-" + (col + 1) + "} ");

				board[row][col] = false;
			}
		}

	}

	public static int NQueensC(boolean[][] board, int row) {

		if (row == board.length) {

			return 1;
		}

		int count = 0;
		for (int col = 0; col < board[0].length; col++) {

			if (isItSafeToPlaceQueen(board, row, col)) {
				board[row][col] = true;
				int ans = NQueensC(board, row + 1);
				count = count + ans;
				board[row][col] = false;
			}
		}

		return count;

	}

}
