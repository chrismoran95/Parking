public class SUV extends Car{
	protected int size;
	protected String Gate;
	public SUV()
	{
    super();
	super.SetSize(2);//sets the size of car to 2 indicating it is a SUV
	super.spot=0;
	}
	public SUV(int spot,int vehiclesize, String licenseplate,boolean valid,String Gate)
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
