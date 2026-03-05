package org.example;

import org.example.game.GameContext;
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
    private GameContext context;

    public ChessGame(GameContext gameContext) {
        this.context = gameContext;
    }

    private void init() {

        context.setBoard(new Board());

        Rook rook1 = new Rook(new Position(5, 5), Color.BLACK, context);
        rook1.calculateAttackZone();
        Pawn pawn = new Pawn(new Position(3, 2), Color.WHITE, context);
        rook1.calculateAttackZone();
    }

    public void start() {

        init();

        while(true) {
            updateOccupier();
            render();

            System.out.print("> ");
            String input = sc.nextLine();

        }
    }



    // 기물 위치를 업데이트함
    public void updateOccupier() {
        Square[][] squares = context.getBoard().getSquares();

        for(Piece piece : context.getPieceList()) {
            Position pos = piece.getPosition();
            squares[pos.getX()][pos.getY()].setOccupier(piece);
            squares[pos.getX()][pos.getY()].setPresent(true);
        }
    }

    private void render() {
        System.out.println(context.getBoard().toString());
    }

}
