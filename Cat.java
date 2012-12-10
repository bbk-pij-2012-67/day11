public class Cat extends Animal implements Mammal{
	public Cat(String name){
		super(name);
	}
	
	public void reproduce(){
		giveBirth();
	}
	
	public void giveBirth(){
		System.out.println("Giving birth");
	}
	
	public void makeSound(){
		System.out.println("Making cat sound");
	}
}
