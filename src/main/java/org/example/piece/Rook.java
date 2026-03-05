package org.example.piece;

import org.example.Color;
import org.example.game.GameContext;
import org.example.map.Board;
import org.example.map.Position;

import java.util.List;

public class Rook extends Piece{
    public Rook(Position pos, Color color, GameContext context) {
        super(pos, color, context);
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
        return color == Color.WHITE ? "R" : "r";
    }
}
