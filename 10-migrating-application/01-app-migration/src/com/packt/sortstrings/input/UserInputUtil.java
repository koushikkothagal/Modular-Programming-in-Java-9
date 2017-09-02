package com.packt.sortstrings.input;

import java.util.Scanner;

public class UserInputUtil {
	Scanner scanner = new Scanner(System.in);
	
	public String getUserInput(String prompt) {
		System.out.print(prompt);
		return scanner.nextLine();
	}
	
	public void close() {
		scanner.close();
	}

}
