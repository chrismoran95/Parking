import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class Parking {

	private ParkingLot parkingLot;
	
	public Parking() {
		this.parkingLot = new ParkingLot();
	}
	
	void simulateDay(String fileName) 
	{
		BufferedReader reader;
		try 
		{
			
			reader = new BufferedReader(new FileReader(fileName));
			
			
			String choice;//reads first line
			int i=0;
			while ((choice = reader.readLine())!=null) 
			{
			
				
				boolean valid;
				int vehiclesize; 
				int spotnumber;
				String licenseplate;
				String splits[] = choice.split(",");//parse everything after comma
				spotnumber = Integer.parseInt(splits[1]);//spot number
				vehiclesize = Integer.parseInt(splits[2]);//vehicle size
				licenseplate = splits[3];//licenseplate
				valid = Boolean.parseBoolean(splits[4]);//boolean
			    String Gate = splits[5];
			    String carname=splits[0];
			    parkingLot.SetSpot(spotnumber);//Sets parking lot spot number
			    if(parkingLot.LotEmpty())//if parkinglot isn't full
			    {
			    
				if(splits[0].equals("truck") && splits[5].equals("Entrance")||splits[0].equals("truck") && splits[5].equals("Exit"))
				{
					
				   
					park(new Truck(spotnumber,vehiclesize,licenseplate,valid,Gate));//parks the vehicle
					//parkingLot.SetSpot(spotnumber);//Sets parking lot spot number
					
				}
				else if (splits[0].equals("suv")&& splits[5].equals("Entrance")||splits[0].equals("suv")&& splits[5].equals("Exit"))
				{
					park(new SUV(spotnumber,vehiclesize,licenseplate,valid,Gate));
				//	parkingLot.SetSpot(spotnumber);
				}
				else if (splits[0].equals("sedan")&& splits[5].equals("Entrance")||splits[0].equals("sedan")&& splits[5].equals("Exit"))
				{
					park(new Sedan(spotnumber,vehiclesize,licenseplate,valid,Gate));
					//parkingLot.SetSpot(spotnumber);
				}
			
				//valid=new Random().nextInt(100) + 1 >= 75;
				if (valid && splits[5].equals("Exit")) 
				{
					
					System.out.println("Car "+carname+" is leaving parking spot number "+spotnumber);
					parkingLot.remove();
				
				}
				else 
				{
					if (valid == false && splits[5].equals("Entrance")) 
					{
					System.out.println("Car "+carname+" will be parked at spot number "+spotnumber);
					}
					else if(valid == false && splits[5].equals("Exit"))
					{
						System.out.println("Car "+carname+" isn't able to be parked at parking spot "+spotnumber+" because the ticket is invalid");
					}
						
				}
				i++;
				}
			    else
			    {
			    	System.out.println("Car "+carname+" isn't able to park at "+spotnumber+" because parking lot only has 100 spots");
			    }
			   
			
			}
			
			reader.close();
			System.out.println("$" + parkingLot.GetPrice() + " made today");
			
			
		} 
		catch (Exception e) 
		{
			System.out.println("Cannot read line");
		}
		
	}
	
	void park(Car car) 
	{
		if(parkingLot.IsEmpty())
		{
		parkingLot.AddCarSpot(car);//adds car to parking spot
		}
		else
		{
			System.out.println("Spot number is being occupied");
		}
	}
	
	public static void main(String[] args)
	{
		Parking p = new Parking();
		p.simulateDay("info-1.txt");
		
	}
}
