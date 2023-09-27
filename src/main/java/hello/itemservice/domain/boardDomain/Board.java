package hello.itemservice.domain.boardDomain;

import lombok.Data;

@Data
public class Board {
    private Long id;
    private String boardName;
    private String boardContent;
}
