package com.tgsouza.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tgsouza.workshopmongo.domain.User;

@RestController
@RequestMapping (value= "/users")
public class UserResource {
	
	@RequestMapping (method=RequestMethod.GET)
	public ResponseEntity<List<User>>findAll () {
		
		User tiago = new User("1", "Tiago", "tiago@gmail.com");
		User lucas = new User("2", "Lucas", "lucas@gmail.com");
		
		
		List<User> list = new ArrayList<User>();
		list.addAll(Arrays.asList(tiago, lucas));
		return ResponseEntity.ok().body(list);
	}

}
