package com.bnt.helloworld.dao;

import java.util.List;

import com.bnt.helloworld.domain.User;
import com.bnt.helloworld.entity.UserEntity;

public interface ILoginDAOOperation {

	public List<UserEntity> checkLoginCredentials();
}
