public class Shark extends AquaticAnimal implements NonMammal{
	public Shark(String name){
		super(name);
	}
	
	public void reproduce(){
		layEggs();
	}
	
	public void layEggs(){
		System.out.println("Laying eggs");
	}
}
