/**
 * 
 */
package com.zensar.streamex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

/**
 * @author TRG
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		IntStream.of(1,2,3,4,5,6,7,8,9).map(n->n*10).forEach(System.out::println);

	}

}
