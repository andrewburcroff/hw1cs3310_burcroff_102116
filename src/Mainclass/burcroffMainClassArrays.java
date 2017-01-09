package Mainclass;

import java.util.Random;
import java.util.Scanner;
import burcroffArraysPackage.*;


public class burcroffMainClassArrays {

	/**
	 * This is my main method where I ask a user to input the amount of integers they would like to work with, 
	 * then set that to an array. Determine whether there are more than 5 elements with values greater then 50 
	 * or not. Then sort the array and print it out. Then I had to delete one element into the array and then 
	 * add another one into the array and sort it again.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Random randy = new Random();
		burcroffArraysClass a = new burcroffArraysClass();
		System.out.println("How integers do you want to work with?");
		int answer = kb.nextInt();
		for (int i = 0; i < answer; i++) {
			a.add(randy.nextInt(100 +1));
			
			
		}
		if (a.search() == true) {
			System.out.println("This is your line after sorting increasing:");
			a.increasing();
			a.printArray();
			System.out.println("This is your arraylist after deleting the fifth element:");
			a.delete(4);//delete element 5
			a.printArray();
			a.add(10);//add element 10 in position 2
			System.out.println("This is your arraylist after inserting element 10 and sorted again:");
			a.increasing();
			a.printArray();
			} else {
			System.out.println("This is your line after sorting decreasing:");	
			a.decreasing();
			a.printArray();
			System.out.println("This is your arraylist after deleting the second element:");
			a.delete(1);// delete element 2
			a.printArray();
			System.out.println("This is your arraylist after inserting element 10 and sorted again:");
			a.add(10);//add element 10 in position 2
			a.decreasing();
			a.printArray();
		}
	}
}
