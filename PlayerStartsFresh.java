public class PlayerStartsFresh {

	static char[] createBoard() {

		char[] board = new char[10];
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
		return board;
	}

	char[] board = createBoard();

	public static void main1(String[] args) {

		System.out.println("Welcome to the Tic_Tac_Toe Game");
	}
}
