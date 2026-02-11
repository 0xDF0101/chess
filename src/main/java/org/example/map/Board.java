package org.example.map;

public class Board {

    private final Square[][] squares = new Square[9][9];
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
                sb.append(String.format("%s ", square.isPresent() ? square.getOccupier().render() : " "));
            }
            sb.append("\n");
        }

        sb.append("  ");
        for(int i=97; i<=104; i++) {
            sb.append(String.format("%c ", i));
        }

        return sb.toString();
    }




}
