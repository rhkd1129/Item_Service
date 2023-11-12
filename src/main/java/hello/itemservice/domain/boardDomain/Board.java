package hello.itemservice.domain.boardDomain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class Board {
    private int boardId;
    private String boardTitle;
    private String boardWriter;
    private String boardRegisterTime;
    private String boardContent;

    public Board() {
    }

    public Board(String boardTitle, String boardWriter, String boardContent) {
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContent = boardContent;
    }



}
