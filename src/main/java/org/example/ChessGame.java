package org.example;

import org.example.map.Board;
import org.example.map.Position;
import org.example.map.Square;
import org.example.piece.Pawn;
import org.example.piece.Piece;
import org.example.piece.Rook;

import java.nio.charset.CoderResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChessGame {
    Scanner sc = new Scanner(System.in);
    private String input;

    public static final List<Piece> pieceList = new ArrayList<>();
    // 현재 올라와있는 기물들의 리스트

    public Board board;

    public ChessGame() {

    }

    public void start() {
        this.board = new Board();

        Rook rook1 = new Rook(new Position(5, 5), Color.BLACK);
        rook1.calculateAttackZone();

        // 여기 위에 코드는 메서드로 옮겨야함
        //---- 생성 끝 ----


        while(true) {
            updateOccupier();
            render();

            System.out.print("> ");
            input = sc.nextLine();

        }
    }

    public static void addPiece(Piece piece) {
        pieceList.add(piece);
        System.out.println();
    }


    // 기물 위치를 업데이트함
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
