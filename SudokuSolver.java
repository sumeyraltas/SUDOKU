
public class SudokuSolver {
	
	public  int [][] board; //for solved board

	
	public SudokuSolver (int [][] board) {
		this.board= new int [9][9];
		this.board=board;
		
	}
	
	
	private boolean checkRowColumn(int row, int col, int number) { //sayýdan o satýrda varsa  veya sayýdan o sütunda varsa false dönüyor, yoksa true
		for(int i =0; i<9; i++) {
			if(board[row][i]==number || board[i][col]==number) {
				return false;
				
			}
		}
		return true;
	}
	
	
	
	
	private boolean checkSmallBox(int row, int col, int number) {//x=boxes x coordinate y=boxes y coordinate
		int x = (row/3)*3;// bu iki denklemle row ve col larý 3 erli þekilde gruplamýþ olduk 012--345--678
        int y = (col/3)*3;
        
        for (int i =0; i<3;i++) {
            for (int j =0; j<3;j++) {
                if (board[i+x][j+y]==number) {//küçük karelerdeki index artýþýný saðladýk
                    return false;
                }
            }
        }
        return true;
    }
	
	
	public boolean solve() {
		
		for(int row =0; row<9 ; row++) {
			for(int col =0; col<9 ; col++) {
				if(board[row][col]==0) {
					for(int number =1; number<=9;number++) {
							 
						if(checkRowColumn(row,col,number)&& checkSmallBox(row, col, number)) {
									board[row][col]=number;	
									if(solve()) {
										return true;
									}
									else {
										board[row][col]=0;
									}
						}
						}
					return false;
						
				}
		
	}
	}
		return true;
		
	}
	
	
	public String toString(int[][] board) {
		String result ="";
		for(int i=0 ; i<9; i++) {
			for(int j =0; j<9;j++) {
				result = result+ board[i][j];
				result = result +" " ;
			
			}
			result = result + "\n";
		}
		return result;
	}
	

	public int[][] getBoard() {
		return board;
	}
	public void setBoard(int[][] board) {
		this.board = board;
	}
	
	
	
}
