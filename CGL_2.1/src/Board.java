
public class Board{
	public boolean[][] board;
	
	public boolean[][] createBoard(int l,int n[][]) {
		if(l<0) { return null;}
		else {
			boolean[][] board = new boolean[l][l];
				for(int i=0;i<board.length;i++) {
					for(int j=0;j<board.length;j++) {
						board[i][j]=false;
					}
				}
			return printBoard(board,n);
			}
		
		}
	public boolean[][] printBoard(boolean board[][],int s[][]) {
		for(int i=0;i<s.length;i++) {
			int a = s[i][0];
			int b = s[i][1];
			board[a][b]=true;
		}
		return board;
	}
	
		/**for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++) 
			{
				board[1][3] = true;
				board[1][4] = true;
				board[2][4] = true;	
				board[5][3] = true;
				board[5][4] = true;
				board[6][2] = true;
				board[6][3] = true;
				board[7][5] = true;
				board[8][4] = true;
				
			}
				
		}
		return board;
		
	}**/
}
