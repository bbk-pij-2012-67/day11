public class Salmon extends AquaticAnimal implements NonMammal{
	public Salmon(String name){
		super(name);
	}
	
	public void reproduce(){
		layEggs();
	}
	
	public void layEggs(){
		System.out.println("Laying eggs");
	}
}
