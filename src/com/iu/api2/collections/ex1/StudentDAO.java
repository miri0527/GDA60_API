package com.iu.api2.collections.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
	private StringBuffer sb;
	
	public StudentDAO() {
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70-"); 
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
	}
	
	public StudentDTO[] init() {
		String s1 = sb.toString();
		
		s1 = s1.replace("-", ",");
		s1 = s1.replace(" ", "");
		
		StringTokenizer st = new StringTokenizer(s1, ",");
		StudentDTO[] students = new StudentDTO[st.countTokens()];
		
		while(st.hasMoreTokens()) {
			StudentDTO sdto = new StudentDTO();
			sdto.setName(st.nextToken());
			sdto.setNum(Integer.parseInt());
		}
		
		return students;
		
	}
	
	public StudentDTO findStudent(StudentDTO[] studentDTOs) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("찾으려는 학생 이름을 검색하세요");
		String findName = scanner.next();
		
		StudentDTO studentDTO = new StudentDTO();
		
		for(int i=0; i<studentDTOs.length; i++) {
			if(studentDTOs[i].getName().equals(findName)) {
				studentDTO = studentDTOs[i];
				return studentDTO;
			}
		}
		return studentDTO;
	}
	
}
