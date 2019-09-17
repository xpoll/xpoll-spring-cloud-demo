package cn.blmdz.cloud.provide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.blmdz.cloud.provide.entity.User;
import cn.blmdz.cloud.provide.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {

	private @Autowired UserService userService;
	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	public int create(User user) {
		return userService.create(user);
	}

	@RequestMapping(value="/delete/{id}", method= RequestMethod.GET)
	public int delete(@PathVariable("id") Integer id) {
		return userService.delete(id);
	}

	@RequestMapping(value="/update", method= RequestMethod.POST)
	public int update(User user) {
		return userService.update(user);
	}

	@RequestMapping(value="/find/{id}", method= RequestMethod.GET)
	public User findById(@PathVariable("id") Integer id) {
		return userService.findById(id);
	}

	@RequestMapping(value="/list", method= RequestMethod.GET)
	public List<User> list() {
		return userService.list();
	}

}
