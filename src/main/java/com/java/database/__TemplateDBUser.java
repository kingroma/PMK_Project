package com.java.database;

import java.util.ArrayList;

import com.java.user.User;
import com.java.user.UserHistory;

public interface __TemplateDBUser {
	
	public boolean start();
	public boolean end();
	
	// db table �����
	public boolean createUserTable();
	public boolean createHistoryTable();
	
	// user get set
	public User getUser(String user_id);
	public boolean setUser(User user);
	
	// ���̵� �α��� ����
	public boolean addUser(User user);  // ȸ������
	public boolean checkUserId(String user_id);  // �ߺ� Ȯ�� 
	public boolean login(String user_id, String user_pw); 
	
	// history get set
	public ArrayList<UserHistory> getUserHistory(String user_id);
	public boolean setUserHistory(UserHistory user_history);
	
	
	
}
 