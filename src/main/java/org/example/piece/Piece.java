package org.example.piece;

import org.example.ChessGame;
import org.example.Color;
import org.example.map.Position;

import java.util.List;

public abstract class Piece {

    protected Position position;
    protected final Color color;
    protected List<Position> attackZones; // 이동 가능한 경로

    public Piece(Position pos, Color color) {
        this.position = new Position(pos);
        this.color = color;
        ChessGame.addPiece(this); // 기물 리스트에 추가됨
    }

    public Position getPosition() {
        return position;
    }

    public void setDead() {
        position = new Position(-1, -1);
    }

    public abstract void move(Position target);
    public abstract void calculateAttackZone(); // 해당 기물이 현재 영향력을 행사하는(또는 이동할 수 있는) 칸을 계산해서 attackZones에 반환함
    public abstract String render(); // 기물을 어떤 문자로 표현할지?


}
