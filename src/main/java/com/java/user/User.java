package com.java.user;

public class User {
	/*
	 * String name // �̸� String account // ���¹�ȣ String home // �ּ� String sex // "����"
	 * , "����" String ��õ�� int money_per_hour // �ñ� int registraion_number // �ֹι�ȣ int
	 * phone // �ڵ�����ȣ int age // ���� int status // ���̵��� ���� 0 ����ȸ�� 1 ������ȸ�� 2 Ż��ȸ��
	 * 
	 */
	private String user_id;
	private String user_pw;

	private String name;
	private String account; // ���¹�ȣ
	private String home; // �ּ�
	private String sex; // ���� "����" / "����"

	private int money_per_hour; // �ñ�
	private int registration_number;
	private int phone;
	private int age;
	private int status;
	
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
