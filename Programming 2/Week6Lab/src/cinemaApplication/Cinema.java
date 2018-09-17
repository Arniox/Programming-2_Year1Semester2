package cinemaApplication;

import cinemaApplication.Seat.SeatType;

public class Cinema {

	private Seat[][] seats;
	
	/**
	 * creates a new seat object with nRows and nCols and populates it
	 * @param nRows
	 * @param nCols
	 */
	public Cinema(int nRows, int nCols)
	{
		seats = new Seat[nRows][nCols];
		
		for(int x = 0; x < nRows; x++)
		{
			for(int y = 0; y < nCols; y++)
			{
				if(y == 0)
				{
					seats[x][y] = new Seat(SeatType.WALL, x + 1, y);
				}
				else if(y == nCols - 1)
				{
					seats[x][y] = new Seat(SeatType.AISLE, x + 1, y);
				}
				else
				{
					seats[x][y] = new Seat(SeatType.MIDDLE, x + 1, y);
				}
			}
		}
	}
	
	/**
	 * sets a seat object in the array at 'row', 'col' to booked
	 * @param row
	 * @param col
	 */
	public void bookSeat(int row, int col)
	{
		seats[row][col].setBooked(true);
	}
	
	@Override
	public String toString()
	{
		String result = "";
		for(Seat[] rows : seats)
		{
			for(Seat s : rows)
			{
				result += s+" ";
			}
			result += "\n";
		}
		return result;
	}
}
