package cn.blmdz.cloud.provide.service;

import java.util.List;

import cn.blmdz.cloud.provide.entity.User;

public interface UserService {

	int create(User user);
	
	int delete(Integer id);
	
    int update(User user);
    
    User findById(Integer id);
    
    List<User> list();
}
