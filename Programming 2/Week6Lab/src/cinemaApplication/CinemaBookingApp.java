package cinemaApplication;

import java.util.Random;
import java.util.Scanner;

public class CinemaBookingApp {
	
	private static Scanner scanner;
	private static Random random;
	
	public static void main(String[] args)
	{
		scanner = new Scanner(System.in);
		random = new Random();
		
		Cinema cinema = new Cinema(/*getPlaneSize(5)*/7, /*getPlaneSize(5)*/7); //rows then columns
		
		System.out.println("Available Seats");
		System.out.println(cinema);
		
		BookSeat(cinema);
		System.out.println("Current Seat positions left over: ");
		System.out.println(cinema);
		
		scanner.close();
	}
	
	private static void BookSeat(Cinema cinema)
	{
		int row = 0;
		int column = 0;
		String input = null;
		
		do{
			System.out.println("What row do you wish to book?");
			row = scanner.nextInt();
			
			System.out.println("What column do you wish to book?");
			column = scanner.nextInt();
			cinema.bookSeat(row - 1, column);
			
			System.out.println("Do you wish to book more seats? (Y/N)");
			input = scanner.next();
			input = input.toUpperCase();
			
			if(!input.equals("Y"))
			{
				cinema = null;
			}
			
			
		}while(cinema != null);
	}
	
	private static int getPlaneSize(int Limit)
	{
		int planeSeatingSize = random.nextInt(Limit);
		return planeSeatingSize;
	}
}
