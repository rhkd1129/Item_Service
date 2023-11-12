package hello.itemservice.controller.boardController;

import hello.itemservice.domain.boardDomain.Board;
import hello.itemservice.domain.boardDomain.UpdateBoard;
import hello.itemservice.domain.item.Item;
import hello.itemservice.service.boardService.BoardSeviceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/board/boards")
@RequiredArgsConstructor
@Slf4j
public class BoardController {

    @Autowired
    private BoardSeviceImpl boardSeviceImpl;

    @GetMapping
    public String boards(Model model) {
        List<Board> boards = boardSeviceImpl.findAll();
        model.addAttribute("boards", boards);
//        List<Item> items = itemRepository.findAll();
//        model.addAttribute("items", items);
        return "board/boards";
    }

    @GetMapping("/{boardId}")
    public String board(@PathVariable long boardId, Model model) {
        Board board = boardSeviceImpl.findByBoardId(boardId);
        model.addAttribute("board", board);
        log.info("board registerTime = {}", board.getBoardRegisterTime());

        return "board/board";
    }

    @GetMapping("/add")
    public String addForm() {
        return "board/addBoardForm";
    }

    @PostMapping("/add")
    public String addBoard(Board board, RedirectAttributes redirectAttributes) {
        boardSeviceImpl.registerBoard(board);
        log.info("boardId={}", board.getBoardId());
        redirectAttributes.addAttribute("boardId", board.getBoardId());
        redirectAttributes.addAttribute("status", true);

        return "redirect:/board/boards/{boardId}";
    }



    @GetMapping("/{boardId}/edit")
    public String editForm(@PathVariable Long boardId, Model model) {
        Board board = boardSeviceImpl.findByBoardId(boardId);
        model.addAttribute("board", board);
        return "board/editBoardForm";
    }

    @PostMapping("/{boardId}/edit")
    public String edit(@PathVariable Long boardId, @ModelAttribute UpdateBoard board) {

        log.info("boardId = {}, boardTitle = {}", board.getBoardId(), board.getBoardTitle());
        boardSeviceImpl.updateByBoardId(board);
        return "redirect:/board/boards/{boardId}";
    }
}
