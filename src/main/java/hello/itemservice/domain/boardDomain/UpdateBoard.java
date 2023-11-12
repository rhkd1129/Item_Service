package hello.itemservice.domain.boardDomain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateBoard {
    private int boardId;
    private String boardTitle;
    private String boardUpdateTime;
    private String boardContent;

    public UpdateBoard() {
    }

    public UpdateBoard(String boardTitle, String boardContent) {
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
    }
}
