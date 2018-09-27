package com.ict.sp.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.sp.vo.Dept;

@Repository
public class TestDAO {
	
	@Autowired
	private SqlSessionTemplate sst;

	public List<Dept> getList(){
		Dept d = new Dept();
		d.setDeptno(1);			//첫번째
		d.setDeptname("네임");
		return sst.selectList("DEPT.selectDept",d);  //네임스페이스하고 , 
	}
}
