package org.example.map;

import org.example.piece.Piece;

public class Square {
    private final Position squarePosition;
    private Piece occupier;
    private boolean isPresent;

    public Square(Position position) {
        this.squarePosition = position;
        this.isPresent = false;
    }

    public void setPresent(boolean isPresent) {
        this.isPresent = isPresent;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public Piece getOccupier() {
        return occupier;
    }

    public void setOccupier(Piece piece) {
        this.occupier = piece;
    }






}
