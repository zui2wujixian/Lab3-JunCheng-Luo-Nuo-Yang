/**
 * 
 */
package lab3;

/**
 * @author kkeogh
 *  This is a class used to test my Council information system classes
 */
public class TestDriverClass {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// create test case 1 - a person owning a pet dog
		Person p1 = new Person( "25 somewhere Street","Kathleen","2000");
		Animal myPet = new Animal("CockerSpaniel","Fido");
		course c1=new course("AI",123,233333);
		p1.addAPet(myPet);
		p1.enrolincourse(c1);
		System.out.println("I have a person object : " + p1.toString());
		System.out.println(c1.toString());
		// create test case 2 - another person owing a pet dog
		Person p2 = new Person("12 curly avenue","Fred", "3350");
		Animal anotherPet = new Animal("Labrador","Sue");
		p2.addAPet(anotherPet);
		System.out.println("I have a second person object : " + p2);
		
		

	}

}
