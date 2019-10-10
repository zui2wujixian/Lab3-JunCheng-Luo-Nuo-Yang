/**
 * 
 */
package lab3;
import java.util.Random;
/**
 * @author Hughluo
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int num=r.nextInt(20)+1;
		if(num%2==0) {
			System.out.println(num);
			System.out.println("tails");
		}
		else
		{	System.out.println(num);
			System.out.println("heads");
		}
		switch (num%2) {
		case 0:
			System.out.println(num);
			System.out.println("tails");
			break;
		default:
			System.out.println(num);
			System.out.println("heads");
			break;
		}
		
	}

}
