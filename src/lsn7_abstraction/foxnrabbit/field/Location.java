package lsn7_abstraction.foxnrabbit.field;

public class Location {
	private int row;
	private int col;
	
	Location(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	int getRow() { return row; }
	
	int getCol() { return col; }
}
