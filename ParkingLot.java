import java.util.ArrayList;

public class ParkingLot {
private int occupation = 100;
private int spotsize;
private int row;
private int level;
private int spotnumber;
private double money;//increase price for big cars
Car vehicle;

public int GetSpot()
{
	return spotnumber;
}
public boolean IsEmpty()
{
if(vehicle==null)//if there isn't a vehicle then spot is empty
{
	return true;
}
else
{
	return false;//else there is a vehicle in the spot
}
}
public boolean IsAtEntrance()
{
	
}


}
