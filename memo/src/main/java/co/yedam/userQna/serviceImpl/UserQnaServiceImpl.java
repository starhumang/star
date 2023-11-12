package co.yedam.userQna.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSourceMybatis;
import co.yedam.userQna.mapper.UserQnaMapper;
import co.yedam.userQna.service.UserQnaService;
import co.yedam.userQna.service.UserQnaVO;

public class UserQnaServiceImpl implements UserQnaService {
	SqlSession sqlSession = DataSourceMybatis.getInstance().openSession(true);
	//true는 자동커밋
	UserQnaMapper mapper = sqlSession.getMapper(UserQnaMapper.class);
	//ListMapper.java 사용함

	@Override
	public List<UserQnaVO> userQnaAllList() {
		return mapper.userQnaAllList();
	}

	@Override
	public UserQnaVO userQnaSelect(int qanNo) {
		return mapper.userQnaSelect(qanNo);
	}

	@Override
	public int userQnaInsert(UserQnaVO vo) {
		return mapper.userQnaInsert(vo);
	}

	@Override
	public int userQnaUpdate(UserQnaVO vo) {
		return mapper.userQnaUpdate(vo);
	}

	@Override
	public int userQnaDelete(UserQnaVO vo) {
		// TODO Auto-generated method stub
		return mapper.userQnaDelete(vo);
	}





}
