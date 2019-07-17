package com.ruanhao.springbootvue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class UserController {
	
	@GetMapping("/getUserById")
	public String getUserById(Integer id) {
		return "-----------getUserById-----------------";
	}
	@GetMapping("/deleteUserById")
	public String deleteUserById(Integer id) {
		return "----------deleteUserById---------";
	}
}
