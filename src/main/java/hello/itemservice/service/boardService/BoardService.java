package hello.itemservice.service.boardService;

import hello.itemservice.domain.boardDomain.Board;
import hello.itemservice.domain.boardDomain.UpdateBoard;

import java.util.List;

public interface BoardService {

    void registerBoard(Board board);

    List<Board> findAll();

    Board findByBoardId(long boardId);

    void updateByBoardId(UpdateBoard board);
}
