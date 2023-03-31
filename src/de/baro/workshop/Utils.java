package de.baro.workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Utils {
	public static Random rnd = new Random();
	public static BufferedReader reader;
	
	public static String input() throws IOException{
		String temp = reader.readLine();
		output("--------------------");
		return temp;
	}
	
	public static void output(String output) {
		System.out.println(output);
	}
}
