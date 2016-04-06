package com.eshta.platform.services.user.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eshta.platform.services.user.model.User;

/**
 * Created by Senussi at night :)
 */
@RestController
@RequestMapping("/user")
public class UserREST {

	/**
	 * Sample usage: curl $HOST:$PORT/user/1
	 *
	 * @param userId
	 * @return
	 */
	@RequestMapping("/{userId}")
	public User getUser(@PathVariable Long userId) {

		return new User(userId, "User #" + userId);
	}
}
