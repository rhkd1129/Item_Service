package hello.itemservice.mapper.boardMapper;

import hello.itemservice.domain.boardDomain.Board;
import hello.itemservice.domain.boardDomain.UpdateBoard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BoardMapper {

    void insertBoard(Board board);

    List<Board> selectAllBoard();

    Board selectByBoardId(long boardId);

    void updateByBoardId(UpdateBoard board);
}
