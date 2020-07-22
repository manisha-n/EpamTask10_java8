package com.epam.EpamTask10_java8;
import java.util.*;
import java.util.stream.*;


public class AverageInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>(Arrays.asList(9,7,5,3,1));

        IntStream s1=Arrays.stream(list.stream().mapToInt(i->i).toArray());

        double averageint = getAvg(s1);

        System.out.println("The average of the given numbers is: "+averageint);

	}
	 public static double getAvg(IntStream streamints){
	        return streamints.average().getAsDouble();
	    }

}
