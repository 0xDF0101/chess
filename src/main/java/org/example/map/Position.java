package org.example.map;

public class Position {

    private int x;
    private int y;
    // 공개 범위를 어떻게 할지?

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(Position pos) {

        this.x = pos.getX();
        this.y = pos.getY();
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setPosition(Position pos) {

        this.x = pos.getX();
        this.y = pos.getY();
    }

}
