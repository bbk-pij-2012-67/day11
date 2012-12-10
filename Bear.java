public class Bear extends Animal implements Mammal{
	public Bear(String name){
		super(name);
	}
	
	public void reproduce(){
		giveBirth();
	}
	
	public void giveBirth(){
		System.out.println("Giving birth");
	}
	
	public void makeSound(){
		System.out.println("Making bear animal sound");
	}
}
	
	
