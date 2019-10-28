
public class Truck extends Car {
	protected int size;
	protected String Gate;
	public Truck()
	{
    super();
	super.SetSize(3);//sets the size of car to 3 indicating it is a truck
	super.spot=0;
	}
	public Truck(int spot,int vehiclesize, String licenseplate,boolean valid,String Gate)
	{  
		super(spot,vehiclesize,licenseplate,valid);
		this.size=vehiclesize;
		this.Gate=Gate;
	}
	public int GetTicket()
	{
		return super.getTicket();
	}
}
