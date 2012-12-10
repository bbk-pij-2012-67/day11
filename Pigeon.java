public class Pigeon extends FlyingAnimal implements NonMammal{
	public Pigeon(String name){
		super(name);
	}
	
	public void reproduce(){
		layEggs();
	}
	
	public void layEggs(){
		System.out.println("Laying eggs");
	}
}
