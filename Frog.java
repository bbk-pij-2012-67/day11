public class Frog extends Animal implements NonMammal{
	public Frog(String name){
		super(name);
	}
	
	public void reproduce(){
		layEggs();
	}
	
	public void layEggs(){
		System.out.println("Laying eggs");
	}
	
	public void makeSound(){
		System.out.println("Making frog sound");
	}
}
