import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {
	Student s = new Student("Erica", "Svensson", 32, 'F');
	Student s2 = new Student("Elsa", "Bredskog", 0, 'F', 3.0, 0.7, 2.3);

	@Test
	public void testSetAndGetFirstName() {
		s.setFirstName("Erica2");
		assertEquals(s.getFirstName().equals("Erica2"), true);
	}
	
	@Test
	public void testSetAndGetLastName() {
		s.setLastName("Svensson2");
		assertEquals(s.getLastName().equals("Svensson2"), true);
	}
	
	@Test
	public void testSetAndGetAge() {
		s.setAge(33);
		assertEquals(s.getAge(),33);
	}
	
	@Test
	public void testSetAndGetGender() {
		s.setGender('F');
		assertEquals(s.getGender(), 'F');
	}
	
	@Test
	public void testSetAndGetFirstGrade() {
		s.setFirstGrade(7.7);
		assertEquals(s.getFirstGrade() == 7.7,true);
	}
	
	@Test
	public void testSetAndGetSecondGrade() {
		s.setSecondGrade(8.2);
		assertEquals(s.getSecondGrade() == 8.2,true);
	}
	
	@Test
	public void testSetAndGetThirdGrade() {
		s.setThirdGrade(7.9);
		assertEquals(s.getThirdGrade() == 7.9,true);
	}
	
	@Test
	public void testSetAndGetAverageGrade() {
		s.setAverageGrade(5.0);
		
		//Skulle kunnat ha den här:
		//s.setFirstGrade(5.0);
		//s.setSecondGrade(5.0);
		//s.setThirdGrade(5.0);
		
		assertEquals(s.getAverageGrade() == 5.9,true);
	}
	
	@Test
	public void testCalculateAverageWithParam() {
		s.setSecondGrade(5.0);
		s.setThirdGrade(5.0);
		double result = s.calculateAverage(5.0);
		assertEquals((s.getAverageGrade()==result) && (result == 5.0), true);
	}
	
	@Test
	public void testCalculateAverageWithNoParam() {
		s.setFirstGrade(5.0);
		s.setSecondGrade(5.0);
		s.setThirdGrade(5.0);
		s.calculateAverage();
		assertEquals((s.getAverageGrade()==5.0), true);
	}
	
	@Test
	public void testCalculateAverageWithAllParam() {
		s.calculateAverage(5.0, 5.0, 5.0);
		assertEquals(s.getAverageGrade()==5.0, true);
	}



	
}
