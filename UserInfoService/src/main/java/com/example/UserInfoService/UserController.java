package com.example.UserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/user/")
	public Iterable<User> getListOfUsers() {
		return userService.getListOfUsers();
	}
	@GetMapping(value = "/user/{idUser}")
	public User getUser(@PathVariable("idUser") int idUser) {

		return userService.getUser(idUser);

	}

	@PostMapping(value = "/user/add/")
	public void addUser(@RequestBody User user) throws Exception {
		userService.addUser(user);
	}

	@DeleteMapping(value = "/user/delete")
	public void deleteUser(@RequestParam("idUser") int idUser) {
		userService.deleteUser(idUser);
	}

	@PutMapping(value = "/user/update/{idUser}")
	public void rent(@PathVariable("idUser") int idUser,
			@RequestParam(value = "update", required = true) boolean update, @RequestBody User user) {

		if (update) {
			userService.updateUser(user);
		}

	}
}

/*
 * { "name": "assia" }, { "name": "dalia" }, { "name": "naim" }, { "name":
 * "bahia" }
 */
