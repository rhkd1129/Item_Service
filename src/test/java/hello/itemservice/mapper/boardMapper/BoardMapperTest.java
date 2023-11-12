package hello.itemservice.mapper.boardMapper;

import hello.itemservice.domain.boardDomain.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardMapperTest {

    @Autowired
    private BoardMapper boardMapper;

    @Test
    void insert() {
        Board board = new Board();
        board.setBoardTitle("title1");
        board.setBoardWriter("writer1");
        board.setBoardTitle("blah blah blah");

        boardMapper.insertBoard(board);

    }


}
