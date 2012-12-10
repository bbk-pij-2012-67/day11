public class Fly extends FlyingAnimal implements NonMammal{
	public Fly(String name){
		super(name);
	}
	
	public void reproduce(){
		layEggs();
	}
	
	public void layEggs(){
		System.out.println("Laying eggs");
	}
}
