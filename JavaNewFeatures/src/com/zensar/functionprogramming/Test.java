/**
 * 
 */
package com.zensar.functionprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author TRG
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		List<Integer> evenNumberList = new ArrayList<Integer>();
		
		Function<Integer, Integer> f1 = (Integer i1) -> {
			if (i1%2==0)
			{
				evenNumberList.add(i1);
				return i1;
		    }
			return 0;
		};
		
		for(int i : numbers)
			f1.apply(i);
			
		for(int i : evenNumberList)
			System.out.println(i);
	

	}

}
