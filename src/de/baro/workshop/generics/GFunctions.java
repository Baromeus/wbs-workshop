package de.baro.workshop.generics;

import java.util.List;
import java.util.function.BiPredicate;

import de.baro.workshop.Utils;

public class GFunctions {
	public static <T> void shuffle(List<T> list) {
		for(int i = 0; i < list.size(); i++) {
			int index = i + Utils.rnd.nextInt(list.size() - i);
			T temp = list.get(index);
			list.set(index, list.get(i));
			list.set(i, temp);
		}
	}
	
	public static <T> void sort(List<T> list, BiPredicate<T, T> fun) {
		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < list.size() - 1; j++) {
				if(fun.test(list.get(j), list.get(j+1))) {
					T temp = list.get(j+1);
					list.set(j+1, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
}
