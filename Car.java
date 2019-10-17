import java.util.ArrayList;

public abstract class Car {
private ArrayList<ParkingLot> Spot = new ArrayList<ParkingLot>(); 
private int ticket;
private boolean valid;

public void AddCartoSpot(ParkingLot number)//adds vehicle to certain parking spot
{
	if(number.IsEmpty()&&IsValid())//if parking spot is empty and has a ticket
	{
	Spot.add(number);//adds car to certain spot number
	}
	else
	{
		System.out.println("Parking spot isn't empty");
	}
}

public int getTicket()
{
	return ticket;
}
public void CreateTicket(ParkingLot number)
{
	
	ticket=number.GetSpot();//creates the tickets//so when we customer is at entrance it will check to see if parking spot matches ticket
	valid = true;
}
public boolean IsValid() {//checks if ticket is valid
	
	return valid=true;
}
  
}
