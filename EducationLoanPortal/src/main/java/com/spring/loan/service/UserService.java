package com.spring.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.loan.model.UserModel;
import com.spring.loan.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository ur;

    public UserModel post4(UserModel amodel6)
    {
     return ur.save(amodel6);
    }
    
    public List<UserModel> get4()
    {
     return ur.findAll();
    }
    
    public UserModel put4(UserModel amodel7)
    {
     return ur.saveAndFlush(amodel7);
    }
    
    public void delete4(int id)
    {
     ur.deleteById(id);
    }
}
