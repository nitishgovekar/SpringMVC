package com.bnt.helloworld.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.bnt.helloworld.domain.User;
import com.bnt.helloworld.entity.EmployeeEntity;
import com.bnt.helloworld.entity.UserEntity;

@Repository
@Qualifier("loginDaoOperation")
public class LoginDAOOperation implements ILoginDAOOperation {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<UserEntity> checkLoginCredentials() {
		
		Boolean isValidCredential = Boolean.FALSE;
		
		/*Query query = getEntityManager().createNamedQuery("findUser");
	    query.setParameter("username", username);
	    query.setParameter("password", password);

	    return (User) query.getSingleResult();*/

		 /*Query query = entityManager.createQuery("SELECT e FROM login e where id=?1");
	        query.setParameter(1, id);
	         
	        Employee employee = (Employee) query.getSingleResult();
	        System.out.println("Found: " + employee);*/
		
		 /* Query query1 = entityManager.createQuery("Select u from UserEntity u where u.userName=:user");
	      String result = (String) query1.getSingleResult();
	      System.out.println("Max Employee Salary :" + result);*/
	        
	        
		/* String dbUser = (String) entityManager.createQuery("SELECT u FROM UserEntity u WHERE u.userName=:user", UserEntity.class).getSingleResult();
		 String dbPass = (String) entityManager.createQuery("SELECT u FROM UserEntity u WHERE u.password=:password", UserEntity.class).getParameterValue("password");
		 
		 String uiUser = user.getUserName();
		 String uiPass = user.getPassword();
		 
		 if((!(uiUser.isEmpty() && uiPass.isEmpty())) && 
				 (dbUser.equals(uiUser) && dbPass.equals(uiPass))) {
			isValidCredential = Boolean.TRUE;
		 }
		 else {
			 isValidCredential = Boolean.FALSE;	 
		 }*/
		 
		List<UserEntity> users = entityManager.createQuery("Select a From UserEntity a", UserEntity.class).getResultList();
		return users;
	}

}
