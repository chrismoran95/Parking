import java.sql.Timestamp;

public abstract class Car {
//private ArrayList<ParkingLot> Spot = new ArrayList<ParkingLot>(10); 
private int ticket;
private boolean valid;
private int vehiclesize;
protected int spot;
protected String licenseplate;
private Timestamp timestamp;

Car()
{
	spot = 0;
	ticket=0;
	valid=false;
	this.timestamp = new Timestamp(System.currentTimeMillis());

}
Car(int spot,int vehiclesize, String licenseplate,int ticket,boolean valid)
{
	this.spot=spot;
	this.vehiclesize=vehiclesize;
	this.licenseplate=licenseplate;
	this.ticket=ticket;
	this.valid=valid;
	
	this.timestamp = new Timestamp(System.currentTimeMillis());
}
public void SetSize(int n)
{
	vehiclesize=n;//sets vehicle size
}
public boolean IsASedan()
{
	if(vehiclesize==1)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public boolean IsATruck()
{
	if(vehiclesize==3)
	{
		return true;
	}
	else
	{
		return false;
	}
}

public boolean IsASuv()//check if it is an suv
{
	if(vehiclesize==2)//if the vehicle size is 2 then it is 
	{
		return true;
	}
	else
	{
		return false;
	}
}
public void AddCartoSpot(int spot)//adds vehicle to certain parking spot
{
	this.spot=spot;
}
public int GetSpot()
{
	return spot;
}
public int getTicket()
{
	return ticket;
}

public boolean IsValid() {//checks if ticket is valid
	
	return valid==true;
}
  
}
