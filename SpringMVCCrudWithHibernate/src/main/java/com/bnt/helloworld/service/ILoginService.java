package com.bnt.helloworld.service;

import java.util.List;

import com.bnt.helloworld.domain.User;

public interface ILoginService {


	public List<User> checkLoginCredentials();
}
