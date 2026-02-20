package org.example.game;

import org.example.ChessGame;
import org.example.Color;
import org.example.map.Board;
import org.example.piece.Piece;

import java.util.ArrayList;
import java.util.List;

/**
 * Context는 그 순간의 스냅샷(상태 데이터)만 기록한다!
 * 실제 게임의 흐름은 ChessGame.class가 가져간다.
 *
 * Board의 전체적인 흐름을 알아야 하는 기물들은 GameContext를 주입받으면 된다!
 */

public class GameContext {
    // 모든 기물이 공유해야할 정보들!
    private Board board;
    private Color currentTurn;
    private List<Piece> pieceList = new ArrayList<>();

}


