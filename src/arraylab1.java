import java.util.Scanner;

/**
 * 
 */

/**
 * @author h.meadows
 *Mr.Hardman
 *project 5, program 1
 *11/22/2016
 */
public class arraylab1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int[] myArray = {8, 17, 69, 40, 24, 55, 29, 37};
		int index = -1;
		int minimum;
		int userValue;
		
		//to iterate through an array, we use a for loop!
		//i is the current index we are looking at i  the array
		//i will search through every element in the array
		//because i will continue until it is as large as the length
		//of the array
		for(int i = 0; i < myArray.length; i++){
			
			//this will display all values
			System.out.print(myArray[i] + "   ");
		}
		
		//this code gets the value the user wants to search for
		System.out.println();
		System.out.println("What value do you want the index of?");
		userValue = userInput.nextInt();
		
		//To search for something, i need to look at every element of the array, 
		//this is accomplished by looping through all the elements
		for(int i = 0; i < myArray.length; i++){
			if(myArray[i]==userValue){
				index = i;
			}
		}
		
		if(index == -1){
			System.out.println("This is not in the array!");
		} else {
			System.out.println(userValue + " is at index " + index);
		}
		
		/**
		 * finding the minimum value of an array
		 */
		minimum = myArray[0];
		//to find the minimum value of the array, we have to search
		//through every element of the array and see if the current 
		//value is smaller than the previous value
		
		for(int i = 0; i < myArray.length; i++){
			
			//checks whether the current element is less than minimum
			if(myArray[i] < minimum){
				
				//if yes, change minimum to current element
				minimum = myArray[i];
				
			}
		}
		
		System.out.println("The minimum value is " + minimum);
		
		userInput.close();
		
	}

}
