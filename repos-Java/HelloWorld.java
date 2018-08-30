/* HelloWorld.java
 */
//import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class HelloWorld
{
	public static void main(String[] args) {
	
	int[] nums = {5, 3, 6, 8, 11, 2};
    change(nums);
}
public static void change (int[] arr) {
    int k = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (k < arr[i]) {
            arr[0] = arr[i];
            arr[i] = k;
            k = arr[0];
        }
    }
}
/*
		int col = 10;
		int row = 10;

		int shot;

		int times = 5;

		boolean result = true;

		// Integer x = new Integer(0);
		// Integer y = new Integer(0);

		int x = 0;
		int y = 0;

		int[][] array1 = new int[10][10];
	

		for(int i = 0; i < 5; i++){

			placeAship(x, y, array1);
		}	
		printArraySum(array1);

		for(int i = 0; i < 5; i++){
			placeAshipPC(x, y, array1);
		}	
		printArraySum(array1);

		System.out.println("Player guess.");
		for (int i = 0; i < times; i++){
			x = inputX();
			y = inputY();
			validateShip(x,y,array1);
		}

		printArrayAfter(array1);
	*/

	}


	// Display the array content
	public static void printArraySum(int arraySum[][]){

		// Display the first row of the map
		System.out.print(" ");
		for(int i = 0; i < arraySum.length; i++){
			System.out.print(" " + i + " ");
		}

		System.out.println();
		for (int i = 0; i < arraySum.length; i++){
			System.out.print(i);
			for (int j = 0; j < arraySum[i].length; j++){
				// if the element in the array equal to 1 (Player) or 2 (PC)
				// the console will display the @ instead
				if (arraySum[i][j] == 1 || arraySum[i][j] == 2 )
					System.out.print(" " + '@' + " " );
				else
					System.out.print(" " + ' ' + " " );


				if (j == arraySum.length-1)
					System.out.print(i);
			}
			System.out.println();
		}

		// Display the last row of the map
		System.out.print(" ");
		for(int i = 0; i < arraySum.length; i++){
			System.out.print(" " + i + " ");
			// System.out.println();
		}

			System.out.println();
	}


	// Display the array after guess!
	public static void printArrayAfter(int arraySum[][]){

		// Display the first row of the map
		System.out.print(" ");
		for(int i = 0; i < arraySum.length; i++){
			System.out.print(" " + i + " ");
		}

		System.out.println();
		for (int i = 0; i < arraySum.length; i++){
			System.out.print(i);
			for (int j = 0; j < arraySum[i].length; j++){
				// if the element in the array equal to 1 (Player) or 2 (PC)
				// the console will display the @ instead
				if (arraySum[i][j] == 1 || arraySum[i][j] == 2 )
					System.out.print(" " + arraySum[i][j] + " " );
				else if (arraySum[i][j] == 9)
					System.out.print(" " + '!' + " " );
				else if (arraySum[i][j] == 8)
					System.out.print(" " + '@' + " " );
				else if (arraySum[i][j] == 3){
					System.out.print(" " + 'x' + " " );
				}
				else if (arraySum[i][j] == 0){
					System.out.print(" " + ' ' + " " );
				}

				if (j == arraySum.length-1)
					System.out.print(i);
			}
			System.out.println();
		}

		// Display the last row of the map
		System.out.print(" ");
		for(int i = 0; i < arraySum.length; i++){
			System.out.print(" " + i + " ");
			// System.out.println();
		}

			System.out.println();
	}

	// User enter X-coordinate
	public static int inputX(){
		Scanner reader = new Scanner(System.in);

		boolean status = true; 
		int x;

		do{
			System.out.print("Enter x: ");
			x = reader.nextInt();
			if(x < 0 || x > 10){
				System.out.print("Invalid X-coordinate! Re-enter X-coordinate. ");
				status = false;
			}	
			else{
				status = true;
			}
		}
		while (status == false);

		return x;
	}

	// User input Y-coordinate
	public static int inputY(){
		Scanner reader = new Scanner(System.in);

		boolean status = true; 
		int y;

		do{
			System.out.print("Enter y: ");
			y = reader.nextInt();
			if(y < 0 || y > 10){
				System.out.print("Invalid Y-coordinate! Re-enter Y-coordinate. ");
				status = false;
			}	
			else{
				status = true;
			}
		}
		while (status == false);
		
		// y = reader.next().charAt(0);

		return y;
	}

	// PC generate X-coordinate for PC
	public static int inputPCx(){
		Random rand = new Random();
		int randX = rand.nextInt(10);

		return randX;		
	}

	// PC generate Y-coordinate for PC
	public static int inputPCy(){
		Random rand = new Random();
		int randY = rand.nextInt(10);

		return randY;	
	}

	// Check if it is a valid coordinate X & Y
	public static boolean validateInput(int x, int y, int arraySum[][]){
	
		if (arraySum[x][y] == 0){
			return true;
		}
		return false;			
	}

	// check if the input within the range of the OceanMap

	public static void placeAship(int x, int y, int arraySum[][]) {
		boolean status = false;

		while(status == false){
			// x = inputPCx();
			// y = inputPCy();
			x = inputX();
		    y = inputY();

			status = validateInput(x,y,arraySum);
			if (status == false){
				System.out.println("Invalid coordinate!");
			}
			else{
				arraySum[x][y] = 1;
			}

		}

	}

	public static void placeAshipPC(int x, int y, int arraySum[][]) {
		boolean status = false;

		while(status == false){
			x = inputPCx();
			y = inputPCy();
			// x = inputX();
		    // y = inputY();

			status = validateInput(x,y,arraySum);
			if (status == false){
				System.out.println("Invalid coordinate!");
			}
			else{
				arraySum[x][y] = 2;
			}

		}

	}

	public static void validateShip(int x, int y, int arraySum[][]){
		int status; // 1.RIGHT Guessed 2.SHOT yourself 3..NOthing there 4. INVALID input
		if(arraySum[x][y] == 2){
			//status = 1; // "Boom! You sunk the ship!" - 9
			System.out.println("Boom! You sunk the ship!");
			arraySum[x][y] = 9;
		}
		else if (arraySum[x][y] == 1){
			//status = 2; // "Oh no, you sunk your own ship :("
			System.out.println("Oh no, you sunk your own ship :(");
			arraySum[x][y] = 8;	
		}
		else if ( arraySum[x][y] != 1 && arraySum[x][y] != 2){
			//status = 3; // "Sorry, you missed"
			System.out.println("Sorry, you missed");
			arraySum[x][y] = 3;
		}
		//return status; 
	}

}
//LR1 @ labrat1i

//bad operand types for binary operator ' ' -- because compare different dataType
// Why the loop repeat infinite time when I put the inputPCx and inputPCy in 
// for loop in main funcion. But it works when I put it inside the function

/*VALID GUESS
  - guessed coordinates of computer's ship _ "!"
  - entered coordinates of player's ship _ "x"
  - No ship on the guessed coordinate _ "-"

  23 AUG 2018
  	Player and PC take turn to pick the coordinate
  	Display the OCEAN MAP after each Player's and PC's turn
  	Display the number of ship left
  	Display the score
  */
