package be.steformation.modele;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import be.steformations.modele.General;

public class GeneralTest {
	private General cmptg;

	@Before
	public void init() {
		cmptg = new General();
	}
	
	@Test
	public void testisSubDiv() {
		cmptg.setValid(true);
		assertTrue ("le compte est subdivisable", cmptg.isValid());
		
		
	}

}
