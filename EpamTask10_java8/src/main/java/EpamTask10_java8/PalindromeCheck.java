package com.epam.EpamTask10_java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PalindromeCheck {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				List<String> list=Arrays.asList("madam","alaram","racecar","level","oscar","ceaser","doggo","pizza");
				Predicate<String> valid=((String str) -> isPalindromecheck(str));
				List<String> res=Palindromeslist(list,valid);
				System.out.println(res);
			}
	public static List<String> Palindromeslist(List<String> list,Predicate<String> p){
		List<String> l1=new ArrayList<>();
		for(String str : list) {
			if(p.test(str)) {
				l1.add(str);
			}
		}
		return l1;
	}
	public static boolean isPalindromecheck(String str) {
		String str1=str;
		int len=str.length();
		String palind="";
		for(int i=len-1;i>=0;i--) {
			palind=palind+str.charAt(i);
			
		}
		if(palind.equals(str1)) {
			return true;
		}
		else {
			return false;
		}

     }

			
	}


