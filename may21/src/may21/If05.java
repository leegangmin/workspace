
/* ������ ���� 3���� �̾Ƽ� ���� �� ���� ū ������ ����
 * 
 */


package may21;

public class If05 {

	public static void main(String[] args) {
		int random1 = (int) (Math.random() * 10 + 1);
		int random2 = (int) (Math.random() * 10 + 1);
		int random3 = (int) (Math.random() * 10 + 1);
		
		
		
		if (random2 >= random1 && random2 >= random3) {
			int temp = random3;
			random3 = random2;
			random2 = temp;	
		
		} else if (random1 >= random2 && random1 >= random3) {
			int temp = random1;
			random1 = random2;
			random2 = random3;
			random3 = temp;	
		}
		
		
		System.out.println(random1 + "," + random2 + "," + random3);
		
		

	}

}
