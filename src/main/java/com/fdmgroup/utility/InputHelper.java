package com.fdmgroup.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputHelper {

	public static String getInput() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			return br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static double getDoubleInput() {
		String input = getInput();
		return Double.parseDouble(input);

	}

	public static int getIntegerInput() {
		String input = getInput();
		return Integer.parseInt(input);
	}
}
