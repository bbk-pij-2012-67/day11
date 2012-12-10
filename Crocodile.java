public class Crocodile extends Animal implements NonMammal{
	public Crocodile(String name){
		super(name);
	}
	
	public void reproduce(){
		layEggs();
	}
	
	public void layEggs(){
		System.out.println("Laying eggs");
	}
	
	public void makeSound(){
		System.out.println("Making crocodile sound");
	}
}
