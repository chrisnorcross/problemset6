package base;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;

public class Person_Test {
private static PersonDomainModel per1;
	
/*	
	@Test
	public void AddPersonTest(){
		PersonDomainModel per;		
		per = PersonDAL.getPerson(per1.getPersonID());		
		assertNull("The Person shouldn't have been in the database",per);
		per1 = new PersonDomainModel();
		PersonDAL.addPerson(per1);
		per = PersonDAL.getPerson(per1.getPersonID());
		System.out.println(per1.getPersonID() + " found");
		assertTrue(per1.getPersonID()==per.getPersonID());
	}
	
	@Test
	public void UpdatePersonTest()
	{		LocalDate dDate = null;
			per1 = new PersonDomainModel();
			per1.setPersonID(UUID.randomUUID());
			per1.setFirstName("Bert");
			per1.setLastName("Gibbons");
			per1.setBirthday(dDate);
			per1.setCity("Townsend");
			per1.setPostalCode(19010);
			per1.setStreet("214 Labrador Lane");		
		PersonDomainModel per;
		final String C_LASTNAME = "Smith";
		
		per = PersonDAL.getPerson(per1.getPersonID());		
		assertNull("The Person shouldn't have been in the database",per);		
		PersonDAL.addPerson(per1);	
		
		per1.setLastName(C_LASTNAME);
		PersonDAL.updatePerson(per1);
		
		per = PersonDAL.getPerson(per1.getPersonID());

		assertTrue("Name Didn't Change",per1.getLastName() == C_LASTNAME);
	}

	@Test
	public void DeletePersonTest()
	{	LocalDate dDate = null;
		per1 = new PersonDomainModel();
		per1.setPersonID(UUID.randomUUID());
		per1.setFirstName("Bert");
		per1.setLastName("Gibbons");
		per1.setBirthday(dDate);
		per1.setCity("Townsend");
		per1.setPostalCode(19010);
		per1.setStreet("214 Labrador Lane");		
		PersonDomainModel per;		
		per = PersonDAL.getPerson(per1.getPersonID());		
		assertNull("The Person shouldn't have been in the database",per);	
		
		PersonDAL.addPerson(per1);			
		per = PersonDAL.getPerson(per1.getPersonID());
		System.out.println(per1.getPersonID() + " found");
		assertNotNull("The Person should have been added to the database",per);
		
		PersonDAL.deletePerson(per1.getPersonID());
		per = PersonDAL.getPerson(per1.getPersonID());		
		assertNull("The Person shouldn't have been in the database",per);	
		
	}
*/	
}
