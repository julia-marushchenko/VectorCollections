package com.collections.vektor;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Vector;

public class MyVector {
	
	public static void main(String [] str){
		
		//Synchronized collection
		Vector<Double> vector = new Vector<>();
		
		// Checking capacity of the vector
		int capacity = vector.capacity(); // new created vector has 10 buckets free for new elements
		
		// Printing capacity of the vector to console
		System.out.println(capacity);
		
		// Adding elements to a vector
		vector.add(2.0);
		vector.add((double) 5);
		vector.add(10.5);
		vector.add(15.47);
		vector.add(12.3);
		
		// Printing all elements of the vector to console
		System.out.println("Vector elements = " + vector.toString());
		
		// Adding elements with addElement
		vector.add(78.9);
		vector.add(158.9865);
		vector.addElement(42.76);
		vector.add(24.8);
		
		// Printing all elements of the vector to console
		System.out.println("Vector elements = " + vector.toString());
		
		// Creating LinkedList
		LinkedList<Double> list = new LinkedList<>();
		list.add(75.9);
		list.add(63.7);
		list.add(36.0);
		
		// LinkedList created to add to vector, displayed
		System.out.println("LinkedList elements = " + list.toString());
		
		// Adding elements with addAll
		vector.addAll(list);
		
		// Printing all elements of the vector to console
		System.out.println("Vector elements = " + vector.toString());
		
		// Checking amount of elements of the vector
		capacity = vector.capacity();
		
		// Printing capacity of the vector to console
		System.out.println(capacity);
		
		// Removing all elements of the vector
		vector.clear();
		
		// Printing the empty vector to console
		System.out.println("Vector elements = " + vector.toString());
		
		// Adding again elements of the list to vector
		vector.addAll(list);
		
		// Printing all elements of the vector to console
		System.out.println("Vector elements = " + vector.toString());
		
		// Checking amount of elements of the vector
		int capacity1 = vector.capacity();
				
		// Printing capacity of the vector to console
		System.out.println(capacity1); 
		
		// Checking if vector contains element 63.7
		boolean containsOrNot = vector.contains(63.7);
		System.out.println("Vector contains element 63.7: " + containsOrNot);
		
		// Checking if vector contains all 75.9, 63.7, 36.0 elements
		boolean containsAllOrNot = vector.containsAll(list);
		System.out.println("Vector contains all elements: " + containsOrNot);
		
		// Checking if vector contains all 75.9, 63.7, 36.0, 72.0 elements
		list.add(72.0);
		boolean containsAllOrNot1 = vector.containsAll(list);
		System.out.println("Vector contains all elements: " + containsAllOrNot1);
		
		// Copying vector into an array
		Double [] array = new Double [3];
		vector.copyInto(array);
		// Printing copied array into console
		for(int index = 0; index < array.length; index++){
			System.out.println(array[index]);
		}
		// Checking that all elements of vector were copied
		System.out.println(vector.toString()); // They were copied
		
		// Coping vector to verctor1
		
		Vector<Double> vector1 = new Vector<>();
		Double [] array1 = new Double [3];
		vector.copyInto(array1);
		
		// Printing all elements of the array1 to console
		
		System.out.println("Array1 elements = ");
		for(int index = 0; index < array1.length; index++){
			System.out.println("Array1 element number " + index + " = " +  array[index]);
		}
		
		// Printing element number 0 from vector to console
		System.out.println("Element number 0 = " + vector.elementAt(0));
		
		// Printing element number 1 from vector to console
		System.out.println("Element number 1 = " + vector.elementAt(1));
		
		// Printing element number 2 from vector to console
		System.out.println("Element number 2 = " + vector.elementAt(2));
		
		// Printing the first element of vector
		System.out.println("The first element of vector = " + vector.firstElement());
		
		// Printing element number 1 with method get
		System.out.println("Element with index 0 of vector = " + vector.get(0));
		
		// Index of element 63.7 is printed to console
		System.out.println("Index of element 63.7 of vector is = " + vector.indexOf(63.7));
			
		// Removing element 75.9
		System.out.println("Index of element 63.7 of vector is = " + vector.remove(0));
		
		//Using set to replace element 75.9 with 74.0
		System.out.println("Replacement = " + vector.set(1, 74.0));

		// Printing all elements of the vector to console
		System.out.println("Vector elements = " + vector.toString());
		
		// Adding more elements for fitire sorting
		vector.add(3.8);
		vector.add(125.5);
		vector.add(77.9);
		vector.add(99.99);
		vector.add(79.95);
		vector.add(64.99);
		vector.add(71.99);
		
		// Printing all elements of the vector to console
		System.out.println("Vector elements = " + vector.toString());
		
		//Sorting elements of the vector
		Comparator<Double> comparator = Collections.reverseOrder();
		Collections.sort(vector, comparator);
		
		// Printing all elements of the vector to console
		System.out.println("Vector elements = " + vector.toString());

	}

}
