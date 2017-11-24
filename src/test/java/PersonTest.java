import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {
	Person p = new Person("Erica", "Svensson", 32,'F');

	@Test
	public void testSetAndGetFristName() {
		p.setFirstName("Erica2");
		assertEquals(p.getFirstName().equals("Erica2"),true);
	}
	
	@Test
	public void testSetAndGetLastNAme() {
		p.setLastName("Svensson2");
		assertEquals(p.getLastName().equals("Svensson2"),true);
	}
	
	@Test
	public void testSetAndGetAge() {
		p.setAge(33);
		assertEquals(p.getAge(),33);
	}
	
	@Test
	public void testSetAndGetGender() {
		p.setGender('W');
		assertEquals(p.getGender(), 'W');
	}
	

}
