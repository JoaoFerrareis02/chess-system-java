package boardgame;

public class Board {

	private int rows;
	private int colluns;
	private Piece[][] pieces;

	public Board(int rows, int colluns) {
		this.rows = rows;
		this.colluns = colluns;
		pieces = new Piece[rows][colluns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColluns() {
		return colluns;
	}

	public void setColluns(int colluns) {
		this.colluns = colluns;
	}
	
	public Piece piece(int row, int column) {
		return  pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return  pieces[position.getRow()][position.getCollum()];
	}

}
