package Practice;
	
	class human2 implements WatchingTV
	{
		@Override
		public void Switchon() {
	System.out.println("I switched on the TV");		
		}

		@Override
		public void setchannel() {
			System.out.println("I want to set a different channel");
			System.out.println("I set the channel");		
			
		}

		@Override
		public void watchTV() {
			System.out.println("This is my favorite programme!");		
			
		}

		@Override
		public void switchoff() {
			System.out.println("I'm done watching the TV");		
			
		}

	}	
	public class Interfaces {

	public static void main(String[] args) {
human1 obj = new human1();
human2 obj1 = new human2();
obj.Switchon();
obj.setchannel();
obj.watchTV();
obj.switchoff();
System.out.println("==================");
obj1.Switchon();
obj1.setchannel();
obj1.watchTV();
obj1.switchoff();
	}
	}
