package com.iu.api4.network.ex.clients;


import java.util.Scanner;

public class MenuController {
	Scanner scanner;
	
	public MenuController() {
		this.scanner = new Scanner(System.in);
		
	}
	public void start() {
		int select = scanner.nextInt();
		switch(select) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
		}
	}
}
