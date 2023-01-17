package com.iu.api4.network.ex.servers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class StudentController {
	private ServerSocket ss;
	private Socket socket;
	private StudentDAO studentDAO;
	
	
	public void start() throws Exception {
		
		ss = new ServerSocket(8282);
		
		socket = ss.accept();
		studentDAO = new StudentDAO();
		
		ArrayList<StudentDTO> ar = studentDAO.init();
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null; //내가 보내는 것
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		
		//선택번호-Data
		boolean check = true;
		while(check) {
			String select = br.readLine(); //split으로 분리
			String [] s = select.split("-");
			
			switch(s[0]) {
				case "1" :
					select = studentDAO.makeList(ar);
					break;
				case "2" :
					//iu
					//select = studentDAO.findbyname(ar, s[1]);
					break;
				case "3" :
					//3: iu-4-50-75-81
					//select = studentDAO.addStudent(ar);
					
				default :
					check = false;
			}
			
			if(check) {
				bw.write(select + "\r\n");
				bw.flush();
			}
		}
	}
}
