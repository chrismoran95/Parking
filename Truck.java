
public class Truck extends Car {
	protected int size;
	public Truck()
	{
    super();
	super.SetSize(3);//sets the size of car to 3 indicating it is a truck
	super.spot=0;
	}
	public Truck(int spot,int vehiclesize, String licenseplate,int ticket,boolean valid,int size)
	{  
		super(spot,vehiclesize,licenseplate,ticket,valid);
		this.size=size;
	}
	public int GetTicket()
	{
		return super.getTicket();
	}
}
