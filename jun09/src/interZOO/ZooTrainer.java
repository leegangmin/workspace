package interZOO;

public class ZooTrainer {
	public void feed(Predetor predetor) {
		System.out.println(predetor.getName() + "에게 밥을 줍니다.");
	}
	
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("3PO");
		
		Cat cat = new Cat();
		cat.setName("R2D2");
		
		ZooTrainer trainer = new ZooTrainer();
		trainer.feed(cat);
		
	}
}
