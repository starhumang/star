package co.yedam.userQna.mapper;

import java.util.List;

import co.yedam.userQna.service.UserQnaVO;

public interface UserQnaMapper {
	public List<UserQnaVO> userQnaAllList();
	public UserQnaVO userQnaSelect(int qanNo);
	
	//게시글 등록, 수정, 삭제
	public int userQnaInsert(UserQnaVO vo);
	public int userQnaUpdate(UserQnaVO vo);
	public int userQnaDelete(UserQnaVO vo);
}
