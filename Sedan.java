
public class Sedan extends Car {
protected int size;

public Sedan()
{
super();
super.SetSize(1);//sets the size of car to 1 indicating it is a sedan
super.spot=0;
}
public Sedan(int spot,int vehiclesize, String licenseplate,int ticket,boolean valid,int size)
{  
	super(spot,vehiclesize,licenseplate,ticket,valid);
	this.size=size;
	}
}