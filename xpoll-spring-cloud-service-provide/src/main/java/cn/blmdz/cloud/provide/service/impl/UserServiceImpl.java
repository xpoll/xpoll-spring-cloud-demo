package cn.blmdz.cloud.provide.service.impl;

import java.util.List;

import org.assertj.core.util.Lists;
import org.springframework.stereotype.Service;

import cn.blmdz.cloud.provide.entity.User;
import cn.blmdz.cloud.provide.service.UserService;

@Service
public class UserServiceImpl implements UserService {

//	private @Autowired UserDao userDao;
	
	@Override
	public int create(User user) {
//		return userDao.create(user);
		return 1;
	}

	@Override
	public int delete(Integer id) {
//		return userDao.delete(id);
		return 1;
	}

	@Override
	public int update(User user) {
//		return userDao.update(user);
		return 1;
	}

	@Override
	public User findById(Integer id) {
//		return userDao.findById(id);
		return new User(1, "001", "张三", "A001", "体育部", "C001", "小学");
	}

	@Override
	public List<User> list() {
//		return userDao.list();
		List<User> list = Lists.newArrayList();
		list.add(new User(1, "001", "张三", "A001", "体育部", "C001", "小学"));
		list.add(new User(2, "002", "李四", "A002", "奥数部", "C002", "初中"));
		list.add(new User(3, "003", "王五", "A003", "英语部", "C003", "高中"));
		return list;
	}

}
