package com.java.database;

import java.util.ArrayList;

import com.java.location.Location;
import com.java.location.LocationHall;
import com.java.location.LocationHallProcess;
import com.java.location.LocationHallStaffForm;
import com.java.location.LocationMember;
import com.java.location.LocationMemberAuth;
import com.java.location.LocationNotice;
import com.java.location.LocationReadyStaff;

public interface __TemplateDBLocation {
	public boolean start();
	public boolean end();
	
	// db table �����
	public boolean createLocationTable();
	
	//location
	public boolean isLocation(Location location);
	public int getLastLocationNumber(); // location number �ο��� ����
	public boolean sortLocationNumber(); // �ѹ� ����
	public boolean setLocation(Location location); // ����
	public Location getLocation(int location_number); // �ϳ��� ��������� location
	public ArrayList<Location> getLocations(String user_id); // ������ ��������� location
	public ArrayList<Location> getLocations(ArrayList<Integer> location_numbers); // ������ ��������� 
	public boolean setStatusLocation(int location_number,int status);
	
	
	//LocationMember
	public boolean isLocationMember(String user_id,int location_number);
	public boolean addLocationMember(LocationMember location_member,int location_number);
	public LocationMember getLocationMember(String user_id,int location_number);
	public ArrayList<LocationMember> getLocationMembers(int location_number);
	public boolean setLocationMember(LocationMember location_member,int location_number);
	public boolean deleteLocationMember(String user_id,int location_number);
	
	//LocationMemberAuth
	public boolean isLocationMemberAuth(LocationMemberAuth locationMemberAuth);
	public boolean addLocationMemberAuth(LocationMemberAuth locationmemberAuth);
	public boolean deleteLocationmemberAuth(LocationMemberAuth locationmemberAuth);
	public LocationMemberAuth getLocationMemberAuth(String user_id , int location_number);
	public ArrayList<LocationMemberAuth> getLocationMemberAuths(String user_id , int location_number);
	
	//LocationNotice
	public boolean isLocationNotice(int location_number);
	public int getLiastLocationNoticeNumber();
	public boolean addLocationNotice(LocationNotice locationNotrice);
	public ArrayList<LocationNotice> getLocationNotices(int location_number);
	public LocationNotice getLocationNotice(int location_number,int location_notice_number);
	public boolean setLocationNotice(LocationNotice locationNotrice);
	public boolean deleteLocationNotice(int location_notice_number);
	
	//LocationReadyStaff
	public boolean isLocationReadyStaff(LocationReadyStaff locationReadyStaff);
	public boolean addLocationReadyStaff(LocationReadyStaff locationReadyStaff);
	public ArrayList<LocationReadyStaff> getLocationReadyStaffs(int location_number);
	public LocationReadyStaff getLocationReadyStaff(int location_number);
	public boolean setLocationReadyStaff(LocationReadyStaff locationReadyStaff);
	public boolean setLocationReadyStaffs(ArrayList<LocationReadyStaff> locationReadyStaffs);
	public boolean deleteLocationReadyStaff(LocationReadyStaff locationReadyStaff);
	
	//LocationHall
	public boolean isLocationHall(int location_number,int location_hall_number);
	public boolean sortLocationHallNumber();
	public int getLastLocationHallNumber(int location_number); // location hall number �ο��� ���� 
	public ArrayList<LocationHall> getLocationHalls(int location_number);
	public LocationHall getLocationHall(int location_number, int hall_number);
	public boolean setLocationHall(LocationHall locationHall);
	public boolean addLocationHall(LocationHall locationHall);
	public boolean deleteLocationHall(int location_number , int hall_number);
	
	
	//LocationHallProcess
	public boolean isLocationHallProcess(int location_number,int location_hall_number,int location_hall_process_number);
	public int getLastLocationHallProcessNumber();
	public boolean sortLocationHallProcessNumber();
	public boolean addLocationHallProcess(LocationHall locationHall);
	public boolean setLocationHallProcess(LocationHall locationHall);
	public LocationHallProcess getLocationHallProcess(int location_number , int location_hall_number , int location_hall_process_number);
	public ArrayList<LocationHallProcess> getLocationHallProcesses(int location_number , int location_hall_number);
	public boolean deleteLocationHallProcess(int location_hall_process_number);
	
	//LocationHallStaffForm // �̸��� ������ �����̸��̰ٳ� 
	public boolean isLocationHallStaffForm(int location_number , int location_hall_number ,String position);
	public boolean sortLocationHallStaffForm();
	public ArrayList<LocationHallStaffForm> getLocationHallStaffForm(int location_number, int location_hall_number , String position);
	public ArrayList<LocationHallStaffForm> getLocationHallStaffForms(int location_number, int location_hall_number);
	public boolean addLocationHallStaffForms(ArrayList<LocationHallStaffForm> locationHallStaffForms);
	public boolean addLocationHallStaffForm(LocationHallStaffForm locationHallStaffForm);
	public boolean setLocationHallStaffForms(ArrayList<LocationHallStaffForm> locationHallStaffForms);
	public boolean setLocationHallStaffForm(LocationHallStaffForm locationHallStaffForm);
	public boolean deleteLocationHallStaffForm(int location_hall_staff_form_number);
	public boolean deleteLocationHallStaffForm(String position);
	public boolean deleteLocationHallStaffForm(String position , int location_hall_staff_form_number);
	
	//LocationHallForm
	
}
