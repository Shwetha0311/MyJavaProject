package Practice;

public class MotorBike1
{
	 int sum = 300;
	 int speed = 100;
	public void accelerate()
	{
		System.out.println("The bike is speeding up");
	}
	public void decelerate()
	{
		System.out.println("The bike is slowing down");
	}
	
	public MotorBike1() {
		int speed = 100;
	}



public static void main(String[] args) {
	

		System.out.println("Intitial speed of the bike =100");
MotorBike1 honda = new MotorBike1();
MotorBike1 ducati = new MotorBike1();
honda.speed =80;
System.out.println("Honda speed is" + honda.speed);
honda.decelerate();
ducati.speed = 110;
System.out.println("Ducati speed is " + ducati.speed);
ducati.accelerate();
honda.sum = 200;
System.out.println(honda.sum);
	}

}

