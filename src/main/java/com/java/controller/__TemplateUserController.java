package com.java.controller;

import java.util.ArrayList;

import com.java.user.User;
import com.java.user.UserHistory;

public interface __TemplateUserController {

	//sign up
	public boolean signUp (User user);
	public boolean validationId(String user_id);
	public boolean validationPw(String user_pw);
	
	//login
	public boolean login(String user_id , String user_pw );
	
	//check id  
	public boolean idDuplication(String user_id);
	
	// User get set
	public User getUser(String user_id);
	public boolean setUser(User user);
	
	// history get set
	public ArrayList<UserHistory> getUserHistory(String user_id);
	public boolean setUserHistory(UserHistory user_history);
	
	
}
