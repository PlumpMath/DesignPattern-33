package com.design.visitor.sample;

public class Main {

	public static void main(String[] args) {
		ReportList reportList = new ReportList();
		reportList.initReport();
		
		Visitor visitor = new CTO();
		reportList.showReport(visitor);
	}

}
