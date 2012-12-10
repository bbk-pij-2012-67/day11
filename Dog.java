public class Dog extends Animal implements Mammal{
	public Dog(String name){
		super(name);
	}
	
	public void reproduce(){
		giveBirth();
	}
	
	public void giveBirth(){
		System.out.println("Giving birth");
	}
	
	public void makeSound(){
		System.out.println("Making dog sound");
	}
}
