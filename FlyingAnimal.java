public class FlyingAnimal extends Animal{
	
	public FlyingAnimal(String name){
		super(name);
	}
	
	public void call(){
		System.out.println(super.getName() + " now flying, will come later when tired.");
	}
	
	public void makeSound(){
		System.out.println("Making flying animal sound");
	}
	
	public void reproduce(){
		;
	}
}
