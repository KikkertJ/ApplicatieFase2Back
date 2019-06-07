package nl.workingspirit.bootcamp.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	long id;
	
	String naam;
	int leeftijd;
	
	

}
