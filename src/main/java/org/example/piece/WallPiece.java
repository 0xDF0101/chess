package org.example.piece;

import org.example.Color;
import org.example.game.GameContext;
import org.example.map.Position;

import java.util.List;

/**
 * 필요 없는거 같기도?
 */

public class WallPiece extends Piece {
    public WallPiece(Position pos, Color color, GameContext context) {
        super(pos, color, context);
    }

    @Override
    public void move(Position target) {

    }

    @Override
    public void calculateAttackZone() {

    }

    @Override
    public String render() {
        return " ";
    }
}
