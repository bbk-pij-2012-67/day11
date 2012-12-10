public abstract class Animal{
	private String name;
	public Animal(String name){
		this.name = name;
	}
	
	public void call(){
		System.out.println(getName() + " is coming.");
	}
	
	public abstract void reproduce();
	
	public abstract void makeSound();
	
	public String getName(){
		return name;
	}
}
