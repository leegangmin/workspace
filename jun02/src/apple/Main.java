package apple;

public class Main {

	public static void main(String[] args) {
		
		AppleSeller as = new AppleSeller();
		AppleBuyer ab = new AppleBuyer();
		
		ab.buyApple(as, 3000);
		
		ab.buyerInfo();
		as.sellerInfo();
		

	}

}
