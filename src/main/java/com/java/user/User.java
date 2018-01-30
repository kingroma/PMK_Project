package com.java.user;

public class User {

	private String user_id;
	private String user_pw;

	private String name;
	private String account; // 게좌번호
	private String home; // 주소
	private String sex; // 성별 "남자" / "여자"

	private int money_per_hour; // 시급
	private int registration_number; // 주민번호
	private int phone;
	private int age;
	private int status; // 아이디의 상태 0 정상회원 1 비정상회원 2 탈퇴회원

	public User() {
		init();
	}

	public void init() {
		this.user_id = "";
		this.user_pw = "";

		this.name = "";
		this.account = "";
		this.home = "";
		this.sex = "";

		this.money_per_hour = 0;
		this.registration_number = 0;
		this.phone = 0;
		this.age = 0;
		this.status = 0;
	}

}
