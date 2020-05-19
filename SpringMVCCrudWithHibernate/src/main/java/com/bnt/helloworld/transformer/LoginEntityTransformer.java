package com.bnt.helloworld.transformer;

import org.springframework.stereotype.Service;

import com.bnt.helloworld.domain.User;
import com.bnt.helloworld.entity.UserEntity;

@Service
public class LoginEntityTransformer {
	
	
	
	public User transformUserEntity(
			UserEntity entity) {		
		User user = new User();		
		user.setId(entity.getId());
		user.setUserName(entity.getUserName());
		user.setPassword(entity.getPassword());
			
		return user;
	}

}
