package burcroffArraysPackage;

import java.util.Arrays;

public class burcroffArraysClass {
	
	private int[] data;//Initializing a parameter for this class called data which is array.
	private int n;//Initializing a parameter for this class called n for the length of the array.
	
	/*
	 *This method is where I set the two different parameters that are passed into this class.
	 */
	public burcroffArraysClass(){
		data  = new int[1];//Setting the parameter data to one int array.
		n =0;//Setting the parameter integer of n equal to 0.
	}

	/*
	 * This method use for two loops to sort the method by bubble sorting by decreasing the array.
	 */
	
	public void decreasing() {
		int temp;//Setting a temp integer.
		for (int i = 0; i < length() - 1; i++) {
			for (int j = 1; j < length() - i; j++) {
				if (data[j - 1] < data[j]) {//if comparing two elements a and b. if b is greater than a then continue.
					temp = data[j - 1];//Setting the a element to the temp.
					data[j - 1] = data[j];//Setting the element b to the original spot of element a.
					data[j] = temp;//Setting the b element to the temp.
				}
			}
		}
	}
	
	/*
	 * This method use for two loops to sort the method by bubble sorting by increasing the array. 
	 */

	public void increasing() {
		int temp;//Initializing the temp.
        for(int i = 0; i < length(); i++)
        {
            for(int j = 1; j < (length() -i); j++)
            {
                if(data[j-1] > data[j])//if comparing two elements a and b. if b less than than a then continue.
                {
                    temp = data[j-1];//Setting the element b to the original spot of element a.
                    data[j-1]=data[j];//Setting the element b to the original spot of element a.
                    data[j]=temp;//Setting the b element to the temp.
                }
            }
        }
    }
	
	/*
	 * This method will print the array and all of the elements in the array.
	 */
	
	public void printArray() {
		for (int i = 0; i < length(); i++) {//For loop
			System.out.printf("%d ", get(i));//Printing the array of i for the loop.
		}
		System.out.println();//Printing the next line.
	}
	
	/*
	 * This method get the index of the i of the array.
	 * @return the data of i.
	 */
	
	private int get(int i) {
		return data[i];//return the data of i
	}
	
	/*
	 * This method is for the length of array.
	 * @return number of elements in array
	 */

	public int length(){
		return n;//return n of elements
	}

	/*
	 * This method search in the array to determine if the array has 5 or more elements which
	 * are greater than 50.
	 */
	
	public boolean search() {
		int total = 0;//Initailize the int total.
		for (int n = 0; n < length(); n++) {
			if (n >= 50) {
				total++;//Increasing total.
			}
		}
		if (total >= 5) {
			return true;//If there are more than 5 elements greater than 50.
		} else
			return false;//Not more than 5 elements greater than 50.

	}
	
	/*
	 * This method will delete a certain elements in the array.
	 */
	
	public void delete(int value){
		if(n==0){
			System.out.println("The arraylist is empty");//No elements in array.
			return;
		}
		int[] temp = new int[n -1];//Setting a new temp with one less spot
		for(int i = value; i < n-1; i++){
			temp[i] = data[i+1];//Putting all the elements that were greater than the deleted one
		}
		for(int j = value; j >=0; j--){
			temp[j] = data[j];//Putting back all of the elements before the deleted one.
		}
		data =temp;//Rewriting the temp into data.
		n--;//Decreasing n.
	}
	
	/*
	 * This method will add the elements to the array.
	 */

	public void add(int value) {
		if(n==0){
			data[n] = value;//when the array is empty it will add the new elements on
		}
		int[] temp = new int[n +1 ];//Increasing the size of the temp to one more than the orginal.
		for(int i = 0; i < n; i++){
			temp[i] = data[i];//Setting the temp of i to equal the data of the array i.
		}
		temp[n] = value;// Adding the array of n to the parameter of value passed in.
		data =temp;//Overwriting the data with the temp.
		n++;//Increasing the n by 1.
	}
}
