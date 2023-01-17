package com.iu.api2.collection.ex1.teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
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
	
	//학생정보백업
	//현재시간을 파일명으로 해서 파일작성
//	public void backupStudent(ArrayList<StudentDTO> ar) {
//		File file = new File("C:\\fileTest", "students.txt");
//		
//		try {
//			FileWriter fw = new FileWriter(file,true);
//			for(int i=0; i<ar.size(); i++) {
//				StudentDTO studentDTO = ar.get(i);
//				
//				fw.write(ar.get(i).getName()+ "\r\n");
//				fw.write(ar.get(i).getNum() + "\r\n");
//				fw.write(ar.get(i).getKor() + "\r\n");
//				fw.write(ar.get(i).getEng() + "\r\n");
//				fw.write(ar.get(i).getMath() + "\r\n");
//				fw.write(ar.get(i).getTotal() + "\r\n");
//				fw.write(ar.get(i).getAvg() + "\r\n");
//			}
//			
//			fw.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		
//	}
	
	public void studentBackup(ArrayList<StudentDTO> ar) {
		Calendar ca = Calendar.getInstance(); 
		long time = ca.getTimeInMillis();
		
		File file = new File("C:\\fileTest", time + ".txt");
		
		FileWriter fw = null; //fw를 닫아줘야되는데 try안에 생성 해주면 fw 객체가 지역변수가 되기 때문에 위에 null값으로 선언
		
		try {
			fw = new FileWriter(file);
			
			for (StudentDTO studentDTO : ar) {
				StringBuffer sb = new StringBuffer();
				sb.append(studentDTO.getName());
				sb.append("-"); //-로 구분을 지어라
				sb.append(studentDTO.getNum());
				sb.append("-");
				sb.append(studentDTO.getKor());
				sb.append("-");
				sb.append(studentDTO.getEng());
				sb.append("-");
				sb.append(studentDTO.getMath());
				sb.append("\r\n");
			}
			
			fw.write(sb.toString());
			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally { //연결된 자원 끊어야됨 
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
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
		
		for(StudentDTO studentDTO:ar) { //studentDTO를 
			if(name.equals(studentDTO.getName())) {
				st = studentDTO;
				break;
			}
		}
		
		for(int i=0; i<ar.size(); i++) {
			if(ar.get(i).equals(name)) {
				st = ar.get(i);
				break;
			}
			
//			StudentDTO studentDTO = ar.get(i);
		}
		
		return st;
	}
	
	//학생정보초기화
	public ArrayList<StudentDTO> init() { //ArrayList라는 타입을 return
		//String data = this.sb.toString();
		File file = new File("C:\\fileTest");
		String [] names = file.list();
		long max=0; //제일 큰 수를 넣기
		
		for(String name:names) {
			name = name.substring(0,name.lastIndexOf("."));
			long date = Long.parseLong(name); 
			
			if(date > max) {
				max = date;
			}
		}
		
		//1.파일정보 File
		
		file = new File(file,max + ".txt");
	
		//2.파일내용 읽기 위해서 연결 준비
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<StudentDTO> ar = new ArrayList<>(); //StudentDTO는 while문이 사라지면 같이 사라지기 때문에 배열에 저장
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String data = null;
			
			//한줄 읽어오는것
			while((data=br.readLine()) !=null) {
				data = data.replace(" ", "-");
				data = data.replace(",", "");
				StringTokenizer st = new StringTokenizer(data, "-");
				
				while(st.hasMoreTokens()) { //어차피 data=br.readLine()이 되면 한번만 읽기때문에 굳이 여기 while문이 필요가 없다
					StudentDTO studentDTO = new StudentDTO(); //while문밖에 선언하면 객체 여러개를 담을 수 없기 때문
					studentDTO.setName(st.nextToken());
					studentDTO.setNum(Integer.parseInt(st.nextToken()));
					studentDTO.setKor(Integer.parseInt(st.nextToken()));
					studentDTO.setEng(Integer.parseInt(st.nextToken()));
					studentDTO.setMath(Integer.parseInt(st.nextToken()));
					studentDTO.setTotal(studentDTO.getKor() + studentDTO.getEng() + studentDTO.getMath());
					studentDTO.setAvg(studentDTO.getTotal()/3.0);
					ar.add(studentDTO); //배열에 studentDTO 담기
					
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			}catch(Exception e) {
				
			}
		}
		
		return ar;
	}
}
