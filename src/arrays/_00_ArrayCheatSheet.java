package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] arr = new String[5];
		//2. print the third element in the array
		System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[2] = "not null";
		//4. print the third element again
		System.out.println(arr[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i =0; i <5; i++) {
			System.out.println(arr[i]);
		}
		
		//6. make an array of 50 integers
		 int[] arr2 = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i<50;i++) {
			Random r = new Random();
			int j = r.nextInt();
			arr2[i]= j;
			
		}
		int smallest = -999999999;
		int largest = -999999999;
		for(int i=0; i< arr2.length; i++)
		{
			if(arr2[i] >= largest)
				largest = arr2[i];
			else if (arr2[i] <= smallest)
				smallest = arr2[i];
			
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println("The Smallest is "+ smallest);
		//9 print the entire array to see if step 8 was correct
		System.out.println(Arrays.toString(arr2));
		//10. print the largest number in the array.
		System.out.println("The Largest is "+ largest);
		System.out.println(arr2[0]);
	}
}
