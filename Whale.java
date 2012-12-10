public class Whale extends AquaticAnimal implements Mammal{
	public Whale(String name){
		super(name);
	}
	
	public void reproduce(){
		giveBirth();
	}
	
	public void giveBirth(){
		System.out.println("Giving birth");
	}
}
