package com.itbank.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BasicDAO {

	@Autowired private SqlSessionTemplate sst;
	
	public String test() {
		return sst.selectOne("test");
	}
}
