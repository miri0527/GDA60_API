package com.iu.api2.collection.ex1.teacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
private StringBuffer sb;
private Scanner scanner;

	
	public StudentDAO() {
		this.scanner = new Scanner(System.in);
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70-"); 
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
	}
	
	//학생정보삭제
	public int removeStudent(ArrayList<StudentDTO> ar) {
		//삭제확인용 변수
		//0이면 삭제 실패, 1이면 삭제 성공
		int result=0;
		System.out.println("삭제할 이름 입력");
		String name = scanner.next();
		//ar.remove(인덱스번호)
		//ar.remove(Object)
		//1.첫번째방법
//		for(int i=0; i<ar.size(); i++) {
//			if(name.equals(ar.get(i).getName())) {
//				ar.remove(i);
//				result = 1;
//				break;
//			}
//		}
		//2.두번째방법
		for (StudentDTO studentDTO : ar) {
			if(name.equals(studentDTO.getName())) {
				ar.remove(studentDTO);
				result=1;
				break;
			}
		}
		
		return result;
		
	}
	
	//학생정보추가
	public void addStudent(ArrayList<StudentDTO> ar) { //리턴 해줘도되고 안해줘도됨 -> ar은 새로운 객체를 만들지 않고 플러스되기 때문에 
		//리턴되도 어차피 같은 걸 리턴
		
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("이름을 입력하세요");
//		String name = scanner.next();
//		studentDTO.setName(name);
		studentDTO.setName(scanner.next());
		System.out.println("번호를 입력하세요");
		studentDTO.setNum(scanner.nextInt());
		System.out.println("국어점수를 입력하세요");
		studentDTO.setKor(scanner.nextInt());
		System.out.println("영어점수를 입력하세요");
		studentDTO.setEng(scanner.nextInt());
		System.out.println("수학점수를 입력하세요");
		studentDTO.setMath(scanner.nextInt());
		studentDTO.setTotal(studentDTO.getKor() + studentDTO.getEng() + studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3.0);
		ar.add(studentDTO);
		
	}
	
	//학생정보검색
	public StudentDTO findByName(ArrayList<StudentDTO> ar) {
		System.out.println("검색할 이름을 입력하세요");
		String name = scanner.next();
		
		StudentDTO st = null;
		
		for(StudentDTO studentDTO:ar) {
			if(name.equals(studentDTO.getName())) {
				st = studentDTO;
				break;
			}
		}
		
		return st;
	}
	
	//학생정보초기화
	public ArrayList<StudentDTO> init() { //ArrayList라는 타입을 
		String data = this.sb.toString();
		data = data.replace(" ", "-");
		data = data.replace(",", "");
		StringTokenizer st = new StringTokenizer(data, "-");
		ArrayList<StudentDTO> ar = new ArrayList<>(); //StudentDTO는 while문이 사라지면 같이 사라지기 때문에 배열에 저장
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor() + studentDTO.getEng() + studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			ar.add(studentDTO);
			
		}
		return ar;
	}
}
