package cinemaApplication;

public class Seat {

	private boolean booked;
	private SeatType seatType;
	private String seatPosition;

	/**
	 * @return the booked status
	 */
	public boolean isBooked() {
		return this.booked;
	}

	/**
	 * @param booked the booked to set
	 */
	public void setBooked(boolean booked) {
		this.booked = booked;
	}
	public void setSeatPosition(int x, char upperLetter)
	{
		this.seatPosition = "(" + x + ", " + upperLetter + ")";
	}
	
	public Seat(SeatType seatType, int x, int y)
	{
		this.booked = false;
		this.seatType = seatType;
		char[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G'}; 
		char upperLetter = ALPHABET[y];
		this.setSeatPosition(x, upperLetter);
	}
	
	/**
	 * enum type for middle, aisle and wall
	 * @author bjy5305
	 *
	 */
	enum SeatType
	{
		MIDDLE("M"), AISLE("A"), WALL("W");
		
		private String symbol;
		SeatType(String symbol)
		{
			this.symbol = symbol;
		}
		
		private String symbol()
		{
			return symbol;
		}
	}
	
	@Override
	public String toString()
	{
		if(this.isBooked() == true)
		{
			return seatType.symbol() + seatPosition + "[X] ";
		}
		else
		{
			return seatType.symbol() + seatPosition + "[ ] ";
		}
	}
	
	
}
