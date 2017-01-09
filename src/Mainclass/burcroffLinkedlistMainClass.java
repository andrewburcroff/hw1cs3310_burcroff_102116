package Mainclass;

import java.util.Random;
import java.util.Scanner;

import burcroffArraysPackage.burcroffArraysClass;
import burcroffLinkedListPackage.*;



public class burcroffLinkedlistMainClass {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Random randy = new Random();
		burcroffLinkedListClass ll = new burcroffLinkedListClass();
		System.out.println("How integers do you want to work with?");
		int answer = kb.nextInt();
		int i;
		for (i = 0; i < answer; i++) {
			ll.add(randy.nextInt(100 +1));
		}
		ll.printList();
		if (ll.search() == true) {
			System.out.println("This is your Linked List after sorting increasing:");
			ll.increasing();
			ll.printList();
			System.out.println("This is your Linked List after deleting the fifth element:");
			ll.delete(4);//delete element 5
			ll.printList();
			ll.addition(10, 2);//add element 10 in position 2
			System.out.println("This is your Linked List after inserting element 10 and sorted again:");
			ll.increasing();
			ll.printList();
			} else {
			System.out.println("This is your Linked List after sorting decreasing:");	
			ll.decreasing();
			ll.printList();
			System.out.println("This is your Linked List after deleting the second element:");
			ll.delete(1);// delete element 2
			ll.printList();
			System.out.println("This is your Linked List after inserting element 10 and sorted again:");
			ll.addition(10, 2);//add element 10 in position 2
			ll.decreasing();
			ll.printList();
	}
}
}