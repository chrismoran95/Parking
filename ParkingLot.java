import java.util.ArrayList;

public class ParkingLot {
private int maxSize = 100;
private int ticketNumber;
protected int spotsize;
protected int row;
protected int level;
private ArrayList<Car> ParkVehicle; 
protected int spotnumber;
private double money;//increase price for big cars
Car vehicle;
ParkingLot()
{
 level=0;
 row=0;
 spotnumber=0;
 row=0;
 level=0;
 spotsize=0;
 ParkVehicle = new ArrayList<Car>(maxSize);//creates an arraylist of max parking 
 this.ticketNumber = 0;

}
ParkingLot(int level,int spotnumber,int spotsize)
{
	this.spotnumber=spotnumber;
    //ParkVehicle.add(vehicle);//adds vehicle to an arraylist
	this.level=level;
	this.spotnumber=spotnumber;
	this.spotsize=spotsize;
	this.ticketNumber = 0;
}
public void AddCarSpot(Car vehicle)//add vehicle to parking spot
{
	if(IsEmpty()&& LotEmpty())
	{
	 spotnumber=ticketNumber++;
     ParkVehicle.add(vehicle);//adds vehicle to spot number in an arraylist
     
	}
	else
	{
		System.out.println("Parking spot is full");
	}
}
public int GetTicket()
{
	return spotnumber;
}
public void remove() 
{
	if (ParkVehicle.size() == 0)
	{
		
		return;
	}
	 Car c = ParkVehicle.get(0);//removes the first array
	 ParkVehicle.remove(0);//removes the first array
	
	double multiplier=0.0;
	if (c instanceof SUV)
	{
		multiplier = 1.5;
	}
	else if (c instanceof Truck)
	{
		multiplier = 1.75;
	}
	else if (c instanceof Sedan)
	{
		multiplier = 1.25;
	}
	SetPrice(money + (10 * multiplier));
}

public void SetPrice(double money)
{
	this.money=money;
}
public double GetPrice()
{
	return money;
}
public int GetSpot()
{
	return spotnumber;
}
public int SetSpot(int n)
{
	spotnumber=n;
	return spotnumber;
}
public boolean LotEmpty()
{
	if(spotnumber < maxSize)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public boolean IsEmpty()
{
if(vehicle == null)//if there isn't a vehicle then spot is empty
{
	return true;
}
else
{
	return false;//else there is a vehicle in the spot
}
}


}
