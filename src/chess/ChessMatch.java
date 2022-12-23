package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColluns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColluns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('a',2,new Rook(board, Color.WHITE));
		placeNewPiece('b',2,new Rook(board, Color.WHITE));
		placeNewPiece('c',2,new Rook(board, Color.WHITE));
		placeNewPiece('d',2,new Rook(board, Color.WHITE));
		placeNewPiece('e',2,new Rook(board, Color.WHITE));
		placeNewPiece('f',2,new Rook(board, Color.WHITE));
		placeNewPiece('g',2,new Rook(board, Color.WHITE));
		placeNewPiece('h',2,new Rook(board, Color.WHITE));
		placeNewPiece('e',1,new King(board, Color.WHITE));
		
		placeNewPiece('a',7,new Rook(board, Color.BLACK));
		placeNewPiece('b',7,new Rook(board, Color.BLACK));
		placeNewPiece('c',7,new Rook(board, Color.BLACK));
		placeNewPiece('d',7,new Rook(board, Color.BLACK));
		placeNewPiece('e',7,new Rook(board, Color.BLACK));
		placeNewPiece('f',7,new Rook(board, Color.BLACK));
		placeNewPiece('g',7,new Rook(board, Color.BLACK));
		placeNewPiece('h',7,new Rook(board, Color.BLACK));
		placeNewPiece('e',8,new King(board, Color.BLACK));
	}

}
