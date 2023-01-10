package com.iu.api2.collection.ex1.teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	private Scanner scanner;
	private StudentDAO studentDAO; //의존적 -> 가지고 있다
	private StudentView studentView;
	private ArrayList<StudentDTO> ar;
	
	public StudentController() {
		scanner = new Scanner(System.in);
		studentDAO = new StudentDAO(); //멤버변수로 선언을 해주고, 그 변수를 사용할 수 있도록 주입
		studentView = new StudentView();
	}
	
	public void start() {
		boolean check = true;
		//1.학생정보초기화
		//2.학생정보전체조회
		//3.학생정보검색조회(이름)
		//4.학생정보추가
		//5.학생정보삭제(이름)
		//6.종료
		
		while(check) {
			System.out.println("1.학생정보초기화");
			System.out.println("2.학생정보전체조회");
			System.out.println("3.학생정보검색조회");
			System.out.println("4.학생정보추가");
			System.out.println("5.학생정보삭제");
			System.out.println("6.종료");
			int select = scanner.nextInt();
			
			switch(select) {
				case 1:
					ar = studentDAO.init();
					break;
				case 2:
					studentView.view(ar);
					break;
				case 3:
					StudentDTO studentDTO = studentDAO.findByName(ar);
					if(studentDTO !=null) {
						studentView.view(studentDTO);
					}else {
						studentView.view("찾는 학생이 없다");
					}
					break;
				case 4:
					studentDAO.addStudent(ar);
					break;
				case 5:
					select = studentDAO.removeStudent(ar);
					if(select == 1) {
						studentView.view("삭제 성공");
					}else {
						studentView.view("삭제 실패");
					}
					break;
				default :
					check = false;
			}
		}
	}
}
