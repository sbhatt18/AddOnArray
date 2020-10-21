package cs1;
import java.util.Arrays;
import java.util.Scanner;
public class AddOnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		//Step 1: ask user to enter num and value to add by (k)
		System.out.println("Enter the num: ");
		int number=input.nextInt();
		
		System.out.println("Enter value to add by: ");
		int value=input.nextInt();
		
		int summation=number+value;//declaring and initializing variable to hold the latest value of array length 
		int lengthOfSecondArray=0;//declaring and initializing variable to hold the length of final array	
		
		//calculate the length of second array
		do {
			summation=summation/10;
			lengthOfSecondArray++;
		}
		while(summation!=0);
		
		int secondArray[]=new int [lengthOfSecondArray];//declaring and initializing second array to read in data from variable
		
		//Step 2: print the array form of integers to console
		secondArray=addToArrayForm(number,value);//calling the method with proper parameters and initializing it to the second array
		//for loop to print array to console 
		for(int a = 0; a< secondArray.length; a++) {
			  System.out.print(secondArray[a] + " ");
			}
	}

	//Method to add the array form of integers
	public static int[] addToArrayForm(int number, int value) {
		int lengthOne=0;//holds length of initial array
		int lengthTwo=0;//holds updated length of second array
		int holder=number;// declaring and initializing variable to hold the number value
		int summation=number+value;// declaring and initializing variable to hold final value 
		int valueOfSummation=summation;// declaring and initializing variable to hold values of summation
		
		//calculating the length of initial array
		do {
			holder=holder/10;
			lengthOne++;
		}
		while(holder!=0);
		
		int initialArray[]=new int[lengthOne];//creating and initializing initial array to store  
		//storing values in initial array
		for(int a=lengthOne-1;a>=0;a--) {
			initialArray[a]=number%10;
			number=number/10;
		}
		//calculating the length of second array
		do {
			valueOfSummation=valueOfSummation/10;
			lengthTwo++;
		}
		while(valueOfSummation!=0);
		
		int secondArray[]=new int[lengthTwo];//creating and initializing second array to store values after expanding array to take into account more values
		//storing values in second array
		for(int a=lengthTwo-1;a>=0;a--) {
			secondArray[a]=summation%10;
			summation=summation/10;
		}
		return secondArray;//return statement for method 
	}
}