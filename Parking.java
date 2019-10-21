import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Parking {

	private ParkingLot parkingLot;
	
	public Parking() {
		this.parkingLot = new ParkingLot();
	}
	
	void simulateDay(String fileName) {
		try {
			Scanner keyb = new Scanner(new File(fileName));
			
			String choice;
			while (true) {
				if (!keyb.hasNextLine())
					break;
				
				choice = keyb.nextLine();

				if (choice.equals("truck"))
					park(new Truck());
				else if (choice.equals("suv"))
					park(new SUV());
				else if (choice.equals("sedan"))
					park(new Sedan());
				
				
				boolean leave = new Random().nextInt(100) + 1 >= 75;
				if (leave) {
					System.out.println("Car leaving");
					parkingLot.remove();
				}
			}
			
			System.out.println("$" + parkingLot.GetPrice() + " made today");
		} catch (Exception e) {
			
		}
	}
	
	void park(Car car) {
		parkingLot.AddCarSpot(car);
	}
	
	public static void main(String[] args)
	{
		Parking p = new Parking();
		p.simulateDay("info-2.txt");
	}
}
