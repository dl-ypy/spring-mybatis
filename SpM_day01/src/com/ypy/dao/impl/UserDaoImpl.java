package com.ypy.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ypy.dao.IUserDao;
import com.ypy.model.UserModel;
@Repository
public class UserDaoImpl implements IUserDao {
	@Autowired
	private SqlSessionFactory factory;

	@Override
	public List<UserModel> query() {
		SqlSession session = factory.openSession();
		List<UserModel> list = session.selectList("com.ypy.model.UserMapper.query");
		session.close();
		return list;
	}

}
