package com.bnt.helloworld.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bnt.helloworld.dao.ILoginDAOOperation;
import com.bnt.helloworld.domain.Employee;
import com.bnt.helloworld.domain.User;
import com.bnt.helloworld.entity.EmployeeEntity;
import com.bnt.helloworld.entity.UserEntity;
import com.bnt.helloworld.transformer.EmployeeEntityTransformer;
import com.bnt.helloworld.transformer.LoginEntityTransformer;

@Service
@Qualifier("loginService")
public class Loginservice implements ILoginService {

	@Autowired
	@Qualifier("loginDaoOperation")
	ILoginDAOOperation loginDaoOperation;
	
	@Autowired
	private LoginEntityTransformer loginEntityTransformer;
	
	public List<User> checkLoginCredentials() {
		
		List<UserEntity> userList = loginDaoOperation.checkLoginCredentials();
		
		//TRANSORM ENTITY OBJECT INTO DOMAIN OBJECT
		List<User> allUserDetails = new ArrayList<User>();
		for(UserEntity userEntity : userList) {
			allUserDetails.add(loginEntityTransformer.transformUserEntity(userEntity));
		}
		
		return allUserDetails;
		
	}

}
