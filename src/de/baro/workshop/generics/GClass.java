package de.baro.workshop.generics;

import java.util.List;

import de.baro.workshop.Utils;

public class GClass<T> {
	public List<T> list;
	
	public GClass(List<T> list) {
		this.list = list;
	}
	
	public void readObjectType() {
		Utils.output(list.getClass().getSimpleName() + " of " + list.get(0).getClass().getSimpleName());
	}
	
	public void printList() {
		for(int i = 0; i < this.list.size(); i++) {
			Utils.output(this.list.get(i).toString());
		}
	}
}
