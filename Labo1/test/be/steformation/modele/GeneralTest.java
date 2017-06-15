package be.steformation.modele;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import be.steformations.modele.CompteGeneral;

public class GeneralTest {
	private CompteGeneral cmptg;

	@Before
	public void init() {
		cmptg = new CompteGeneral();
	}
	
	@Test
	public void testisSubDiv() {
		cmptg.setValid(true);
		assertTrue ("le compte est subdivisable", cmptg.isValid());
		
		
	}

}
