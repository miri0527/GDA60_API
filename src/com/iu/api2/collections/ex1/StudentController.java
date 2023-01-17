package com.iu.api2.collections.ex1;

import java.util.Scanner;

public class StudentController {
	private Scanner scanner;
	private boolean check = true;
	private StudentDAO sd;
	private StudentView sv;
	private StudentDTO [] students;
	
	public StudentController() {
		this.scanner = new Scanner(System.in);
		this.sd = new StudentDAO();
		this.sv = new StudentView();
		this.students = null;
		
	}
	
	public void start() {
		System.out.println("1.학생정보초기화");
		System.out.println("2.학생정보전체조회");
		System.out.println("3.학생정보검샥조회(이름)");
		System.out.println("4.학생정보추가");
		System.out.println("5.학생정보삭제(이름)");
		System.out.println("6.프로그램종료");
		
		int num = scanner.nextInt();
		
		while(check) {
			if(num == 1) {
				students = sd.init();
				System.out.println("초기화가 완료되었습니다");
				break;
			}
		}
	}
}
