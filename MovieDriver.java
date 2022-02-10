import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		
		String input1, input2;
		int input3;
		int i=0;
		char letter;
		
		//Create a new object of type Scanner that reads from the keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//Create a new movie object
		Movie movie = new Movie();
		
		
		
		while(i<5) 
		{
		keyboard.nextLine();
		//Prompt the user to enter the title of a movie 
		System.out.println("Enter the name of a movie");
		
		input1=keyboard.nextLine();
		
		
		//Set the title in the movie object
		movie.setTitle(input1);
		String title=movie.getTitle();
		
		//Prompt the user to enter the movie’s rating
		System.out.println("Enter the rating of the movie");
		input2=keyboard.nextLine();
		
		//Set the title in the movie object
		movie.setRating(input2);
		String rating=movie.getRating();
		
		//Prompt the user to enter the number of tickets sold at a (unnamed) theater
		System.out.println("Enter the number of tickets sold for this movie");
		input3=keyboard.nextInt();
		
		//Set the number of tickets sold in the movie object
		movie.setSoldTickets(input3);
		int soldTickets=movie.getSoldTickets();
		
		//Display all information of the movie that user inputed
		System.out.println(""+title+" ("+rating+"): Tickets Sold: "+soldTickets);
		
		//Ask the user if they want to continue 
		System.out.println("Do you want to enter another? (y or n)");
		letter=keyboard.next().charAt(0);
			if(letter == 'n') {
			break;
			}
			
		}
		
		//Ending of program
		System.out.println("Goodbye");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
