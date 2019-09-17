package cn.blmdz.cloud.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.blmdz.cloud.provide.entity.User;

@RestController
@RequestMapping(value="/user")
public class UserController {

	private @Autowired RestTemplate restTemplate;
	
	private static final String URL_PREFIX = "http://127.0.0.1:8001/user";
	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	public int create(User user) {
		return restTemplate.postForObject(URL_PREFIX + "/create", user, Integer.class);
	}

	@RequestMapping(value="/delete/{id}", method= RequestMethod.GET)
	public int delete(@PathVariable("id") Integer id) {
		return restTemplate.getForObject(URL_PREFIX + "/delete/" + id, Integer.class);
	}

	@RequestMapping(value="/update", method= RequestMethod.POST)
	public int update(User user) {
		return restTemplate.postForObject(URL_PREFIX + "/update", user, Integer.class);
	}

	@RequestMapping(value="/find/{id}", method= RequestMethod.GET)
	public User findById(@PathVariable("id") Integer id) {
		return restTemplate.getForObject(URL_PREFIX + "/find/" + id, User.class);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value="/list", method= RequestMethod.GET)
	public List<User> list() {
		return restTemplate.getForObject(URL_PREFIX + "/list", List.class);
	}

}
