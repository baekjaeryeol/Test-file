package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface MemberDAO {

	@Select("select * from member")
	List<MemberDTO> selectList();

}
