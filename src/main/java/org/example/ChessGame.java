package org.example;

import org.example.map.Board;
import org.example.map.Position;
import org.example.map.Square;
import org.example.piece.Pawn;
import org.example.piece.Piece;

import java.util.ArrayList;
import java.util.List;

public class ChessGame {

    public static final List<Piece> pieceList = new ArrayList<>();
    // 현재 올라와있는 기물들의 리스트

    public Board board;

    public ChessGame() {

    }

    public void start() {
        this.board = new Board();

        Pawn pawn1 = new Pawn(new Position(4, 2), Color.WHITE);

        updateOccupier();


        render();


    }

    public static void addPiece(Piece piece) {
        pieceList.add(piece);
        System.out.println();
    }



    public void updateOccupier() {
        Square[][] squares = board.getSquares();

        for(Piece piece : pieceList) {
            Position pos = piece.getPosition();
            squares[pos.getX()][pos.getY()].setOccupier(piece);
            squares[pos.getX()][pos.getY()].setPresent(true);
        }
    }

    private void render() {
        System.out.println(board.toString());
    }

}
