package zoo;

public class ZooTrainer {
//	public void feed(Cat cat) {
//		System.out.println(cat.name + "에게 먹이주기");
//	}
//	public void feed(Dog dog) {
//		System.out.println(dog.name + "에게 먹이주기");
//	}
	public void feed(Animal animal) {
		System.out.println(animal.name + "에게 밥주기");
	}
	
	public static void main(String[] args) {
		Cat c01 = new Cat();
		c01.setName("R2D2");
		
		ZooTrainer trainer = new ZooTrainer();
		trainer.feed(c01);
		
		Dog d01 = new Dog();
		d01.setName("3PO");
		
		trainer.feed(d01);
	}
	
}
