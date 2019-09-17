package cn.blmdz.cloud.provide.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.blmdz.cloud.provide.dao.UserDao;
import cn.blmdz.cloud.provide.entity.User;
import cn.blmdz.cloud.provide.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private @Autowired UserDao userDao;
	
	@Override
	public int create(User user) {
		return userDao.create(user);
	}

	@Override
	public int delete(Integer id) {
		return userDao.delete(id);
	}

	@Override
	public int update(User user) {
		return userDao.update(user);
	}

	@Override
	public User findById(Integer id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> list() {
		return userDao.list();
	}

}
