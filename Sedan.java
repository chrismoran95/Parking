
public class Sedan extends Car {
protected int size;
protected String Gate;
public Sedan()
{
super();
super.SetSize(1);//sets the size of car to 1 indicating it is a sedan
super.spot=0;
}
public Sedan(int spot,int vehiclesize, String licenseplate,boolean valid,String Gate)
{  
	super(spot,vehiclesize,licenseplate,valid);
	this.size=vehiclesize;
	this.Gate = Gate;
	}
}