package org.example.map;

import org.example.piece.Piece;
import org.example.piece.Rook;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final static Square[][] squares = new Square[9][9];
    // --> 헷갈리니까 0번째 행렬은 비워둔다

    public Board() {

        for(int j=0; j<=8; j++) {
            for(int i=0; i<=8; i++) {
                squares[j][i] = new Square(new Position(j, i));
            }
        }

        System.out.println("Board 생성 완료");
    }

    public Square[][] getSquares() {
        return squares;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(int i=8; i>0; i--) {
            sb.append(String.format("%d ", i));
            for(int j=1; j<9; j++) {
                Square square = squares[j][i];
//                sb.append("_ ");
                sb.append(String.format("%s ", square.isPresent() ? square.getOccupier().render() : "."));
            }
            sb.append("\n");
        }

        sb.append("  ");
        for(int i=97; i<=104; i++) {
            sb.append(String.format("%c ", i));
        }

        return sb.toString();
    }

    /**
     * 각 기물이 자신의 포지션을 제출하면, 이동가능한 경로를 계산해서 리스트로 넘겨주는 메서드
     */
    public static List<Position> calculateAttackZone(Position pos, Piece piece) {

        List<Position> attackZones = new ArrayList<>();
        Position squarePos = null;
        if(piece instanceof Rook) {
            for(int j=0; j<=8; j++) {
                for(int i=0; i<=8; i++) {
                    squarePos = squares[j][i].getSquarePosition();
                    if(squarePos.getX() == pos.getX() || squarePos.getY() == pos.getY()) {
                        attackZones.add(squarePos);
                    }
                }
            }
        }

        return attackZones;
    }




}
