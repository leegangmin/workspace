package zoo;

public class ZooTrainer {
//	public void feed(Cat cat) {
//		System.out.println(cat.name + "���� �����ֱ�");
//	}
//	public void feed(Dog dog) {
//		System.out.println(dog.name + "���� �����ֱ�");
//	}
	public void feed(Animal animal) {
		System.out.println(animal.name + "���� ���ֱ�");
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
