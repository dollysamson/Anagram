import java.util.Scanner;

/**
	Chapter 3
	Programming Challenge 11, Running the Race
*/

public class RaceResults
{
   public static void main(String[] args)
   {
      String runner1,   	// First runner's name
	     runner2,		// Second runner's name
	     runner3,		// Third runner's name
	     firstPlace,	// Name of first place runner
	     secondPlace,	// Name of second place runner
	     thirdPlace;	// Name of third place runner
      String temp;

      double time1, time2, time3;	//  runner's time
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Display intro.
      System.out.println("This program displays the 1st, 2nd, and 3rd place runners in a race.");
      System.out.println("No ties, please.");
      
      // Get the first runner's data.
      System.out.print("Enter a runner's name: ");
      runner1 = keyboard.nextLine();
      System.out.print("Enter the runner's time: ");
      time1 = keyboard.nextDouble();
      temp  = keyboard.nextLine();
      
      // Get the second runner's data.
      System.out.print("Enter a runner's name: ");
      runner2 = keyboard.nextLine();
      System.out.print("Enter the runner's time: ");
      time2 = keyboard.nextDouble();
      temp  = keyboard.nextLine();
   
      // Get the third runner's data.
      System.out.print("Enter a runner's name: ");
      runner3 = keyboard.nextLine();
      System.out.print("Enter the runner's time: ");
      time3 = keyboard.nextDouble();
		
		// Determine the first place runner.
      if (time1 < time2 && time1 < time3)
         firstPlace = runner1;
      else if(time2 < time1 && time2 < time3)
         firstPlace = runner2;
      else
         firstPlace = runner3;	

		// Determine the second place runner.
      if (time1 < time2 && time1 > time3)
         secondPlace = runner1;
      else if (time1 < time3 && time1 > time2)
         secondPlace = runner1;
      else if(time2 < time1 && time2 > time3)
         secondPlace = runner2;
      else if(time2 < time3 && time2 > time1)
         secondPlace = runner2;
      else
         secondPlace = runner3;
			      
		// Determine the third place runner.
      if (time1 > time2 && time1 > time3)
         thirdPlace = runner1;
      else if(time2 > time1 && time2 > time3)
         thirdPlace = runner2;
      else
         thirdPlace = runner3;

      // Display the results.
      System.out.println("First place: " + firstPlace);
      System.out.println("Second place: " + secondPlace);
      System.out.println("Third place: " + thirdPlace);
   }
}
