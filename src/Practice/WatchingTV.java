package Practice;

public interface WatchingTV
{
public void	Switchon();
void setchannel();
void watchTV();
void switchoff();
}
class human1 implements WatchingTV
{
	@Override
	public void Switchon() {
System.out.println("I switched on the TV");		
	}

	@Override
	public void setchannel() {
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
