package oopsJava;

import java.util.Stack;
import java.util.TreeSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class stackPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack<Integer> lifo = new Stack<>();
//
//		lifo.push(1);
//		lifo.push(10);
//		lifo.push(15);
//		lifo.push(52);
//		lifo.push(85);
//		System.out.println("Original List : " + lifo);
//		lifo.pop();
//		System.out.println("Changed List : " + lifo);

		// Stack
		// Set
		// Array List to Set
		// Check two object are same or note and add them to TreeSet

//		Set<String> nonDuplicateValues = new TreeSet<>();
//		nonDuplicateValues.add("Deepak");
//		nonDuplicateValues.add("Mohit");
//		nonDuplicateValues.add("Pravesh");
//		nonDuplicateValues.add("August");
//		nonDuplicateValues.add("Narendra");
//		nonDuplicateValues.add("Tanuj");
//		nonDuplicateValues.add("Mohit");
//
//		/*
//		 * values are insert in treeset is ascending order & it is slower than hashset
//		 */
//		/*
//		 * Hashset doesn't maintain any order by default and doesnt contain any
//		 * synchronized method . It remove duplicate values . Doesn't contain index number
//		 */
//		/* arraylist and vector maintain order in insertion order */
//
//		System.out.println(nonDuplicateValues);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(22);
		numbers.add(25);
		numbers.add(89);
		numbers.add(25);
		numbers.add(8);
		numbers.add(16);
		
		System.out.println("ArrayList : "+numbers);
		
		Set<Integer> nonDuplicateValues = new TreeSet<>(Collections.reverseOrder());
		nonDuplicateValues.addAll(numbers);
		System.out.println("Tree Set : "+nonDuplicateValues);
		
		numbers.removeAll(numbers);
		numbers.addAll(nonDuplicateValues);
		System.out.println("ArrayList after remove duplicate and sorted : "+numbers);
		
		

	}

}
