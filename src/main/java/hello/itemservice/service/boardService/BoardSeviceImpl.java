package hello.itemservice.service.boardService;

import hello.itemservice.domain.boardDomain.Board;
import hello.itemservice.mapper.boardMapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BoardSeviceImpl implements BoardService{

    @Autowired
    private BoardMapper boardMapper;

    @Override
    public void registerBoard(Board board) {
        board.setBoardWriter("김광희");
        boardMapper.insertBoard(board);
        log.info("boardId={}", board.getBoardId());

    }

    @Override
    public List<Board> findAll() {
        List<Board> boards = boardMapper.selectAllBoard();

        return boards;
    }

    @Override
    public Board findByBoardId(long boardId) {
        Board board = boardMapper.selectByBoardId(boardId);
        log.info("boardId={}", board.getBoardId());
        log.info("boardRegisterTime={}", board.getBoardRegisterTime());

        return board;
    }

}
