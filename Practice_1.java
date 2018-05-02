import java.util.Random;

import javax.swing.JOptionPane;

public class Practice_1 {
	public static void main(String[] args) {
		//0. Create an integer variable and set it equal to 0.
		 int number = 0;
		//1. Make a for loop that runs 10 times and put steps 2, 3, 4 inside of it.
			for(int i = number; i < 10; i++ ) {
			//2. Ask the user for a number
			String input = JOptionPane.showInputDialog(null, "Enter a number");
			//3. Convert their input to an integer
		int x = Integer.parseInt(input);
			//4. Add the number to the integer created in step 0.
		x +=1;
			}
		//5. Display the value of the integer created in step 0.
			System.out.println(number);	
	}}