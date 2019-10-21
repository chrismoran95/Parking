public class SUV extends Car{
	protected int size;
	public SUV()
	{
    super();
	super.SetSize(2);//sets the size of car to 2 indicating it is a SUV
	super.spot=0;
	}
	public SUV(int spot,int vehiclesize, String licenseplate,int ticket,boolean valid,int size)
	{  
		super(spot,vehiclesize,licenseplate,ticket,valid);
		this.size=size;
		
	}
	public int GetTicket()
	{
		return super.getTicket();
	}
}
