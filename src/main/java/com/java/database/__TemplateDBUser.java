package com.java.database;

import java.util.ArrayList;

import com.java.user.User;
import com.java.user.UserHistory;

public interface __TemplateDBUser {
	
	public boolean start();
	public boolean end();
	
	// db table 만들기
	public boolean createUserTable();
	public boolean createHistoryTable();
	
	// user get set
	public User getUser(String user_id);
	public boolean setUser(User user);
	
	// 아이디 로그인 관련
	public boolean addUser(User user);  // 회원가입
	public boolean checkUserId(String user_id);  // 중복 확인 
	public boolean login(String user_id, String user_pw); 
	
	// history get set
	public ArrayList<UserHistory> getUserHistory(String user_id);
	public boolean setUserHistory(UserHistory user_history);
	
	
	
}
 