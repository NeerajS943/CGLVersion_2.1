
public class ConwaysGameOfLife extends Board {

	public int countLiveCells(boolean[][] now, int a, int b) {
		int c = now.length;
		int aliveCells = 0;
		for(int i=a-1;i<=a+1;i++) {
			for(int j=b-1;j<=b+1;j++) {
				if(i != a || j != b) {
					if(i>=0 && i<c && j>=0 && j<c && now[i][j]) {
						aliveCells += 1;
					}
				}
			}
		}
		return aliveCells;
	}
	public String generateNextGeneration(boolean now[][],int x) {
		int n = now.length;
        boolean[][] newBoard = new boolean[n][n];
        for(int a=0;a<x;a++) {
        	for(int i=0;i<n;i++){
        		for(int j=0;j<n;j++){
        			int alive = countLiveCells(now,i,j);
        			if(now[i][j]){
        				if(alive<2){
        					newBoard[i][j]=false;
        					}
        				else if(alive<=3){
        					newBoard[i][j]=true;
        					}
        				else if(alive>3){
        					newBoard[i][j]=false;
        					}
        				}
        			else{
        				if(alive==3){
        					newBoard[i][j] = true;
        					}
        				}
        			}
        		}
        	now=newBoard;
        	}
        return displayBoard(newBoard);
	}
	public String displayBoard(boolean board[][]) {
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

}
