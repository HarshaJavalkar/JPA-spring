package com.res.webservices.jpam.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static Integer usersCount = 3;
	private static List<User> users = new ArrayList<>();
	static {
		users.add(new User(1, "Harsh", new Date()));
		users.add(new User(2, "Sai", new Date()));
		users.add(new User(3, "Shrey", new Date()));
	}

	public List<User> findAll() {

		return users;
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}

	public User findOne(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
}
