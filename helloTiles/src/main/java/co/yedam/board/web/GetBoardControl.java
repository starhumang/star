package co.yedam.board.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.board.service.BoardService;
import co.yedam.board.service.BoardVO;
import co.yedam.board.serviceImpl.BoardServiceImpl;
import co.yedam.common.Command;

public class GetBoardControl implements Command {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		String path = "board/getboard.tiles";
		// boardNo : 1 => DB search = jsp.
		String bno = req.getParameter("bno");
		BoardService svc = new BoardServiceImpl();
		BoardVO vo = svc.getBoard(Integer.parseInt(bno));
	
		req.setAttribute("bno", vo);
		
		try {
			//요청재지정.
			req.getRequestDispatcher(path).forward(req, resp); //getRequestDispatcher로 이동할 위치 지정
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		

	}

}
