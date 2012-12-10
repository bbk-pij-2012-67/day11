public class Beetle extends Animal implements NonMammal{
	public Beetle(String name){
		super(name);
	}
	
	public void reproduce(){
		layEggs();
	}
	
	public void layEggs(){
		System.out.println("Laying eggs");
	}
	
	public void makeSound(){
		System.out.println("Making beetle animal sound");
	}
}
	
