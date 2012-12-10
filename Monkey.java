public class Monkey extends Animal implements Mammal{
	public Monkey(String name){
		super(name);
	}
	
	public void reproduce(){
		giveBirth();
	}
	
	public void giveBirth(){
		System.out.println("Giving birth");
	}
	
	public void makeSound(){
		System.out.println("Making monkey sound");
	}
}
