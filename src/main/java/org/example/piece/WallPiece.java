package org.example.piece;

import org.example.Color;
import org.example.map.Position;

import java.util.List;

public class WallPiece extends Piece {
    public WallPiece(Position pos, Color color) {
        super(pos, color);
    }

    @Override
    public void move(Position target) {

    }

    @Override
    public List<Position> getAttackZone() {
        return List.of();
    }

    @Override
    public String render() {
        return " ";
    }
}
