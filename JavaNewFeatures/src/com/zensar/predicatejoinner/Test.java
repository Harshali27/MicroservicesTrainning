/**
 * 
 */
package com.zensar.predicatejoinner;

import java.util.function.Predicate;

/**
 * @author TRG
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] number = {1,2,3,4,5,6,7,8,9};
		
		Predicate<Integer> p1 = (Integer i) -> {return i%2==0;};
		
		Predicate<Integer> p2 = (Integer i) -> {return i%5==0;};
		
		Predicate<Integer> p3 = p1.and(p2); 
		
		Test.Testpredicate(p3,number);
		
	
		
		

	}

	private static void Testpredicate(Predicate<Integer> p3, int[] number) {
		// TODO Auto-generated method stub
		
	}


}
