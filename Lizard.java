public class Lizard extends Animal implements NonMammal{
	public Lizard(String name){
		super(name);
	}
	
	public void reproduce(){
		layEggs();
	}
	
	public void layEggs(){
		System.out.println("Laying eggs");
	}
	
	public void makeSound(){
		System.out.println("Making lizard sound");
	}
}
