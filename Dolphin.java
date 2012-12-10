public class Dolphin extends AquaticAnimal implements Mammal{
	public Dolphin(String name){
		super(name);
	}
	
	public void reproduce(){
		giveBirth();
	}
	
	public void giveBirth(){
		System.out.println("Giving birth");
	}
}
