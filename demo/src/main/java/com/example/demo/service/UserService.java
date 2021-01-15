package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;

@Service
public class UserService {

	HashMap<Integer,User> hp = new HashMap();

	public String add(User user) {
		hp.put(user.getId(), user);
		return "user add successfully and user id is : "+user.getId();
	}

	public User get(int userId) {
		User existingUser=hp.get(userId);
		return existingUser;
	}

	public String update(User user) {

		hp.put(user.getId(),user);
		return "user update successfully and user id is : "+user.getId();
	}

	public String delete(int userId) {
		hp.remove(userId);
		return "user deleted";
	}

}
