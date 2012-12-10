public class Snake extends Animal implements NonMammal{
	public Snake(String name){
		super(name);
	}
	
	public void reproduce(){
		layEggs();
	}
	
	public void layEggs(){
		System.out.println("Laying eggs");
	}
	
	public void makeSound(){
		System.out.println("Making snake sound");
	}
}
