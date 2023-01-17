package com.iu.api4.network.ex.clients;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import com.iu.api4.network.ex.servers.StudentDTO;

public class ClientMain {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("localhost",8282);
		
		
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
		
		//번호-data
		bw.write("1-\r\n");
		bw.flush();
		
		//응답
		String str=  br.readLine();
		System.out.println(str);
		
		
		
	}

}
