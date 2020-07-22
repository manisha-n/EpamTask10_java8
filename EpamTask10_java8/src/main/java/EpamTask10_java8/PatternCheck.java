package com.epam.EpamTask10_java8;
import java.util.*;
import java.util.function.Predicate;

public class PatternCheck {
	public  static List<String> StringCheck(List<String> l1, Predicate<String> p) {
		List<String> list1=new ArrayList<>();
		for(String str:l1) {
			if(p.test(str)) {
				list1.add(str);
			}
		}
		return list1;
	}

	public static void main(String[] args) {
		List<String> l1=Arrays.asList("all","attack","calf","kitten","aunt","axe","mad","crazy","adorable");
		List<String> l2=StringCheck(l1,(String str)->(str.startsWith("a") && str.length()==3));
		System.out.println(l2);
	}
	
}
