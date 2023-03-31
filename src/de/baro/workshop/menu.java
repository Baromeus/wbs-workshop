package de.baro.workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.baro.workshop.generics.WorkshopGenerics;

public class menu {
	public static void main( String[] arguments) throws IOException {
		Utils.reader = new BufferedReader(new InputStreamReader(System.in));
		IWorkshop workshop = null;
		String input = "";
		Boolean escape = false;
		
		do {
			Utils.output("Hauptmenu");
			Utils.output("1 fuer Generic-Workshop");
			Utils.output("x fuer exit");
			input = Utils.input();
			
			switch(input) {
				case "1": workshop = new WorkshopGenerics(); break;
				case "x": escape = true; break;
				default: break;
			}
			
			if(workshop != null) {
				workshop.start();
				workshop.stop();
			}
			
		}while(!escape);
	}
}
