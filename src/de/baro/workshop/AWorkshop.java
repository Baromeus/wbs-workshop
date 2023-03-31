package de.baro.workshop;

import java.util.List;
import java.util.ArrayList;

public abstract class AWorkshop<T> implements IWorkshop {
	protected List<T> list;
	
	public AWorkshop() {
		this.list = new ArrayList<T>();
	}
	
	public void stop() {
		this.list.clear();
	}
}
