public class Eagle extends FlyingAnimal implements NonMammal{
	public Eagle(String name){
		super(name);
	}
	
	public void reproduce(){
		layEggs();
	}
	
	public void layEggs(){
		System.out.println("Laying eggs");
	}
}
