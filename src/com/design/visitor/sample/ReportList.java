package com.design.visitor.sample;

import java.util.ArrayList;
import java.util.List;

public class ReportList {
	
	List<Staff> mStaffs = new ArrayList<Staff>();
	
	public void initReport() {
		
		Staff staff = new Engineer("LiuYan");
		mStaffs.add(staff);
		
		staff = new Engineer("Java");
		mStaffs.add(staff);
		
		staff = new Engineer("C++");
		mStaffs.add(staff);
		
		staff = new Engineer("Android");
		mStaffs.add(staff);
		
		staff = new Engineer("Python");
		mStaffs.add(staff);
		
		staff = new Manager("Manager");
		mStaffs.add(staff);
	}
	
	public void showReport(Visitor visitor) {
		for (Staff staff : mStaffs) {
			staff.accept(visitor);
		}
	}
}
