package Training1;

public abstract class Animal {

	public abstract void animalSound();
	
	public void sleep() {
		System.out.println("Sleeping all day");
	}
}

class Cat extends Animal {
	
	public void animalSound() {
		System.out.println("Animals make sounds");
		
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("Dog Says: Bow Bow");
	}
}