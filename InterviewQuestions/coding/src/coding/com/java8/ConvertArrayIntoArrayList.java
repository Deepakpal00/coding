package coding.com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayIntoArrayList {

	public static void main(String[] args) {
		Integer a [] = {1,2,3,4,5};
		List<Integer> l = Arrays.asList(a);
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(a));
		
		List<Integer> arrayList = Arrays.stream(a).collect(Collectors.toList());
		
		ArrayList<Integer> arrList = Arrays.stream(a).collect(Collectors.toCollection(ArrayList::new));
		
		List<Integer> k = List.of(a);
		
		List<Integer> i = List.copyOf(Arrays.asList(a));
		
		//******************************************************************************
	}

}
