package org.example;

import org.example.game.GameContext;
import org.example.map.Board;
import org.example.map.Position;
import org.example.piece.Pawn;
import org.example.piece.Piece;

public class Main {
    public static void main(String[] args) {

        ChessGame chessGame = new ChessGame(new GameContext());
        chessGame.start();
    }
}