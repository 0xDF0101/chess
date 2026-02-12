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

    // 좌표를 벗어나는지 검증
    public boolean isPossible(Position pos) {
        return pos.x > 0 && pos.y > 0 && pos.x < 9 && pos.y < 9;
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
