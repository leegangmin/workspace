package polymorphism;

public class Polymorphism02 {
	public static Hero callHero(String spot) {
		if(spot.equals("ÇÏ´Ã")) {
			return new Ironman();
		}else if(spot.equals("¶¥")) {
			return new Hulk();
		}else if(spot.equals("¹Ù´Ù")) {
			return new Spiderman();
		}else {
			return new Thor();
		}
	}
	
	public static void main(String[] args) {
		Hero h1 = callHero("¹Ù´Ù");
		Hero h2 = callHero("¶¥");
		
		h1.attack();
		h2.attack();
		
		
		
		
		
	}
}
