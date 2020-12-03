package com.dln82q.Beadando;

/*import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;*/
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testSzemely {

	private Szemely Embertest = new Szemely();

	@Before // Minden teszteset előtt lefut
	public void init() {
		Embertest.setNev("Béla");  //A személy neve
		Embertest.setKor(25);		//A személy életkora -> legális életkor 18
		Embertest.setAlkohol(true);	//A személy szeretne-e alkoholt inni
	}

	@Test
	public void testValidKor() { //Le ellenőrzi, hogy valós életkort adott-e meg, ami ami a Személy osztályban validkor() metódus definiál
		assertTrue("A személy valós életkort adott meg?", Embertest.validKor()); //Az Embertest.validkor() visszatérési értékét ellenőrzi, hogy igaz-e
		
	}

	@Test
	public void testIszik() // Teszteset, hogy a személy szeretne-e alkoholt inni
	{
		assertTrue("A személy szeretne alkoholt inni?", Embertest.isAlkohol()); // Az Embertest.isAlkohol() visszatérési értékét ellenőrzi, hogy igaz-e
	}

	@Test
	public void testIhat() // Teszteset, hogy a személy elmúlt-e 18 éves
	{
		assertTrue("A személy ihat alkoholt?", Embertest.getKor() > 18); //Ha az Embertest.getkor() nagyobb mint 18, akkor a visszatérési értéke igaz, és a teszteset lefut
	}
	
	@Test
	public void testNevezo()  //A személy átnevezése Andrásra
	{
		Embertest.setNev("András"); //A név átállítása Andrásra
		assertEquals("A személy valós neve.", Embertest.getNev(), "András");  //Az elvárt névvel (András) összehasonlítja az újonnan megadott nevet
	}
	
	@After  //Minden teszteset után alapértékekre állítja az Embertest-et
	public void reset()
	{
		Embertest.setKor(0);
		Embertest.setNev("Teszt");
		Embertest.setAlkohol(false);
	}

}
