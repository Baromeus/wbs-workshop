package de.baro.workshop.generics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import de.baro.workshop.AWorkshop;
import de.baro.workshop.Utils;

public class WorkshopGenerics extends AWorkshop<GClass<?>> {
	
	public WorkshopGenerics() throws IOException {
		super();
		
		List<Integer> intList = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			int temp = Utils.rnd.nextInt(100);
			intList.add(temp);
		}
		
		List<String> strList = new ArrayList<>();
		strList.addAll(List.of("Hans", "Elisa", "Paul", "Amanda", "Frank", "Mendy", "Georg", "Jessi", "Christian", "Kathrin"));
		
		this.list.add(new GClass<Integer>(intList));
		this.list.add(new GClass<String>(strList));
	}
	
	private void numbers() throws IOException {
		String input = "";
		Boolean escape = false;	
		do {
			this.list.get(0).printList();
			Utils.output("");
			Utils.output("Listen wurden erstellt");
			Utils.output("Generic - Menue");
			Utils.output("1 fuer Mischen");
			Utils.output("2 fuer aufsteigend sortieren");
			Utils.output("3 fuer absteigend sortieren");
			Utils.output("4 zeige Datentypen");
			Utils.output("x fuer zurueck");
			input = Utils.input();
			
			switch(input) {
			case "1": GFunctions.shuffle(this.list.get(0).list); ; break;
			case "2": GFunctions.sort(this.list.get(0).list, (x,y) -> (int)x > (int)y); break;
			case "3": GFunctions.sort(this.list.get(0).list, (x,y) -> (int)x < (int)y); break;
			case "4": this.list.get(0).readObjectType(); break;
			case "x": escape = true;
			default : break;
			}			
		}while(!escape);
	}
	
	private void names() throws IOException {
		String input = "";
		Boolean escape = false;	
		do {
			this.list.get(1).printList();
			Utils.output("");
			Utils.output("Listen wurden erstellt");
			Utils.output("Generic - Menue");
			Utils.output("1 fuer Mischen");
			Utils.output("2 von Kurz nach Lang sortieren");
			Utils.output("3 von Lang nach Kurz sortieren");
			Utils.output("4 von A nach Z sortieren");
			Utils.output("5 von Z nach A sortieren");
			Utils.output("6 zeige Datentypen");
			Utils.output("x fuer zurueck");
			input = Utils.input();
			
			switch(input) {
			case "1": GFunctions.shuffle(this.list.get(1).list); ; break;
			case "2": GFunctions.sort(this.list.get(1).list, (x,y) -> ((String)x).length() > ((String)y).length()); break;
			case "3": GFunctions.sort(this.list.get(1).list, (x,y) -> ((String)x).length() < ((String)y).length()); break;
			case "4": GFunctions.sort(this.list.get(1).list, (x,y) -> ((String)x).compareTo((String)y) > 0); break;
			case "5": GFunctions.sort(this.list.get(1).list, (x,y) -> ((String)x).compareTo((String)y) < 0); break;
			case "6": this.list.get(1).readObjectType(); break;
			case "x": escape = true;
			default : break;
			}			
		}while(!escape);
	}
	
	public void start() throws IOException {
		String input = "";
		Boolean escape = false;
		
		do {
			Utils.output("Listen wurden erstellt");
			Utils.output("Generic - Menue");
			Utils.output("1 fuer Nummern");
			Utils.output("2 fuer Namen");
			Utils.output("x fuer zurueck");
			input = Utils.input();
			
			switch(input) {
			case "1": numbers(); break;
			case "2": names(); break;
			case "x": escape = true;
			default : break;
			}
			
		}while(!escape);
	}
}
