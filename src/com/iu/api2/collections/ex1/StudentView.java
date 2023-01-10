package com.iu.api2.collections.ex1;


public class StudentView {
	//학생들을 받아서 출력
	
	public void view(StudentDTO [] studentDTOs) {
		for(int i=0; i<studentDTOs.length; i++) {
			StudentDTO student =studentDTOs[i];
			this.view(student);
		}
	}
	
	public void view(StudentDTO studentDTO) {
		System.out.println("Name : " + studentDTO.getName());
		System.out.println("Num: " + studentDTO.getNum());
		System.out.println("Kor : " + studentDTO.getKor());
		System.out.println("Eng: " + studentDTO.getEng() );
		System.out.println("Math : " + studentDTO.getMath());
		System.out.println("Avg : " + studentDTO.getAvg());
		System.out.println("Total : " + studentDTO.getTotal());
	}
}
