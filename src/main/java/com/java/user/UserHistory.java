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
	private int bonus; // 보너스
	
	private boolean get_money; // 돈 받았냐 default false; 
	private boolean captain;
	

	private double hours; // 몇시간일했는지
	private double expect_start_time; // 예상 출근 시간
	private double expect_end_time; // 예상 퇴근 시간
	private double real_start_time; // 실제 출근 시간
	private double real_end_time; // 실제 최근 시간
	
	
	
}
