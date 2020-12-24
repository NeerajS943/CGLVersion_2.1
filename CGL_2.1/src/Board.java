
public class Board implements BoardIf{
	private boolean newBoard[][];
	private final int lenOfBoard;
	private final int widOfBoard;
	private boolean isStatusChange;
	
	public Board(int lenOfBoard, int widOfBoard,boolean isStatuschange) {
		this.lenOfBoard = lenOfBoard;
		this.widOfBoard = widOfBoard;
		this.isStatusChange = isStatusChange;
	}
	public String printBoard(boolean board[][]) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++) 
			{
				if(board[i][j])
					sb.append("*");
				else
					sb.append(".");
			}
			sb.append("\n");
		}
		return(sb.toString());
	}
	public void createBoard(int l[][]) {
		boolean[][] board = new boolean[this.lenOfBoard][this.widOfBoard];
		for(int i=0;i<this.lenOfBoard;i++) {
			int row = l[i][0];
			int col = l[i][1];
			board[row][col] = true;
		}
		printBoard(board);
	}
	public boolean isStatusChange() {
		return isStatusChange;
	}
	public void setStatus(boolean isStatusChange) {
		this.isStatusChange = isStatusChange;
	}
	public int getBoardLen() {
		return lenOfBoard;
	}
	public int getBoardWid() {
		return widOfBoard;
	}
	
	
}
