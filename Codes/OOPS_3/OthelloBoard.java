package OOPS_3;

public class OthelloBoard {

	private int board[][];
	final static int player1Symbol = 1;
	final static int player2Symbol = 2;

	public OthelloBoard() {
		board = new int[8][8];
		board[3][3] = player1Symbol;
		board[3][4] = player2Symbol;
		board[4][3] = player2Symbol;
		board[4][4] = player1Symbol;
	}

	public void print() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean move(int symbol, int x, int y){
		boolean res = false;
		board[x][y] = symbol;
		int opponent = 1;
		if (symbol == 1) {
			opponent = 2;
		}
		//left
		if (checkFlip(board , x-1 , y , -1 , 0 , symbol , opponent)) {
			res = true;
			flip(board , x-1 , y , -1 , 0 , symbol , opponent);
		}
		// right
		if (checkFlip(board , x+1 ,y , 1 , 0 , symbol , opponent)) {
			res = true;
			flip(board , x+1 , y , 1 , 0 , symbol , opponent);
		}
		//down
		if (checkFlip(board , x , y-1 , 0 ,-1 , symbol , opponent)) {
			res = true;
			flip(board , x , y-1 , 0 , -1 , symbol , opponent);
		}
		// up
		if (checkFlip(board , x , y+1 , 0 ,1 , symbol , opponent)) {
			res = true;
			flip(board , x , y+1 , 0 ,1 , symbol , opponent);
		}
		//down left
		if (checkFlip(board , x-1 , y-1 , -1 ,-1 , symbol , opponent)) {
			res = true;
			flip(board , x-1 , y-1 , -1 ,-1 , symbol , opponent);
		}
		//down right
		if (checkFlip(board , x+1 , y-1 ,1, -1 , symbol , opponent)) {
			res = true;
			flip(board , x+1 , y-1 , 1 ,-1 , symbol , opponent);
		}
		//up left
		if (checkFlip(board , x-1 , y+1 ,-1, 1 , symbol , opponent)) {
			res = true;
			flip(board , x-1 , y+1 , -1 , 1, symbol , opponent);
		}
		//up right
		if (checkFlip(board , x+1 , y+1 , 1 ,1, symbol , opponent)) {
			res = true;
			flip(board , x+1 ,y+1 , 1, 1,symbol , opponent);
		}
		return res;

	}
	private void flip(int[][] board, int x, int y, int deltax, int deltay, int mypiece, int opponentPiece) {
		while(board[x][y]==opponentPiece) {
			board[x][y] = mypiece;
			x += deltax;
			y += deltay;
		}
	}

	public boolean checkFlip(int board[][] , int x , int y , int deltax , int deltay , int mypiece , int opponentPiece) {

		if (board[x][y] == opponentPiece) {
			while((x >= 0 ) && (x<8) && (y >= 0) && (y<8)) {
				x += deltax;
				y += deltay;
				if (board[x][y]== 0)
					return false;
				if (board[x][y]== mypiece)
					return true;
				//				else {
				//
				//				}
			}
		}
		return false;

	}

}




