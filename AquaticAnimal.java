public class AquaticAnimal extends Animal{
	
	public AquaticAnimal(String name){
		super(name);
	}
	
	public void call(){
		System.out.println(super.getName() + " will not come.");
	}
	
	public void makeSound(){
		System.out.println("Making aqautic animal sound");
	}
	
	public void reproduce(){
		;
	}
}
