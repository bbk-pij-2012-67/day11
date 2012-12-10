public class Ark{
	
	public static void main(String[] args){
		Ark ark = new Ark();
		ark.launch();
	}
	
	public void launch(){
		Animal bear = new Bear("Bear 1");
		bear.call();
		bear.reproduce();
		bear.makeSound();
		
		Animal beetle = new Beetle("Beetle 1");
		beetle.call();
		beetle.reproduce();
		beetle.makeSound();
		
		Animal cat = new Cat("Cat 1");
		cat.call();
		cat.reproduce();
		cat.makeSound();
		
		Animal crocodile = new Crocodile("Crocodile 1");
		crocodile.call();
		crocodile.reproduce();
		crocodile.makeSound();
		
		Animal dog = new Dog("Dog 1");
		dog.call();
		dog.reproduce();
		dog.makeSound();
		
		Animal dolphin = new Dolphin("Dolphin 1");
		dolphin.call();
		dolphin.reproduce();
		dolphin.makeSound();
		
		Animal eagle = new Eagle("Eagle 1");
		eagle.call();
		eagle.reproduce();
		eagle.makeSound();
		
		Animal fly = new Fly("Fly 1");
		fly.call();
		fly.reproduce();
		fly.makeSound();
		
		Animal frog = new Frog("Frog 1");
		frog.call();
		frog.reproduce();
		frog.makeSound();
		
		Animal lizard = new Lizard("Lizard 1");
		lizard.call();
		lizard.reproduce();
		lizard.makeSound();
		
		Animal monkey = new Monkey("Monkey 1");
		monkey.call();
		monkey.reproduce();
		monkey.makeSound();
		
		Animal pigeon = new Pigeon("Pigeon 1");
		pigeon.call();
		pigeon.reproduce();
		pigeon.makeSound();
		
		Animal salmon = new Salmon("Salmon 1");
		salmon.call();
		salmon.reproduce();
		salmon.makeSound();
		
		Animal shark = new Shark("Shark 1");
		shark.call();
		shark.reproduce();
		shark.makeSound();
		
		Animal snake = new Snake("Snake 1");
		snake.call();
		snake.reproduce();
		snake.makeSound();
		
		Animal whale = new Whale("Whale 1");
		whale.call();
		whale.reproduce();
		whale.makeSound();
	}
}
