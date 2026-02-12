package org.example.piece;

import org.example.Color;
import org.example.map.Board;
import org.example.map.Position;

import java.util.List;

public class Rook extends Piece{
    public Rook(Position pos, Color color) {
        super(pos, color);
    }

    @Override
    public void move(Position target) {

    }

    @Override
    public void calculateAttackZone() {
        attackZones = Board.calculateAttackZone(position, this);
    }

    @Override
    public String render() {
        return "R";
    }
}
