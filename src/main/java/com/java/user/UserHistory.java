package com.java.user;

public class UserHistory {

	private String user_id; // foreign
	private int location_number; // foreign

	private String date;
	private String memo;
	private String position;

	private int work_hour;
	private int money ;
	private int money_per_hour;
	private int bonus; // ���ʽ�
	
	private boolean get_money; // �� �޾ҳ� default false; 
	private boolean captain;
	

	private double hours; // ��ð����ߴ���
	private double expect_start_time; // ���� ��� �ð�
	private double expect_end_time; // ���� ��� �ð�
	private double real_start_time; // ���� ��� �ð�
	private double real_end_time; // ���� �ֱ� �ð�
	
	
	
}
