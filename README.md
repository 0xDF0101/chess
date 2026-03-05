# chess
쌩 자바로 체스 엔진을 만들어보자 


## 도입 개념 
- `Context` 개념 도입
  - -> 보드의 전체 상태를 공유할 수 있도록 함

```java
public class GameContext {
    private Board board;
    private TeamColor currentTurn;
    // 모든 기물이 공유해야 할 정보들을 여기 담아!
}

public abstract class Piece {
    protected GameContext context; // 기물이 게임의 상황을 알 수 있게 함
}
```


