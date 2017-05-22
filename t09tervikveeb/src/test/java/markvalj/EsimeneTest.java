package markvalj;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	
	@Test
	public void test1(){
	assertEquals(3, 3);
	}
	

	//automaattest, mis annab x-le v‰‰rtuse valemis  y=3x ning kontrollib vastust
	@Test 
	public void test2(){
		
	Character orc = new Character("orc", 1300, 160, 40);
	
		// kui tegu on komakoha arvudega, siis see on vajalik
		// viimane komakoht n√§itab vea range-i
		assertEquals("orc", orc.rynnatakse("elf", 1000, 90, 30));
	}

	@Test 
	public void test3(){
		
	Character inimene = new Character("inimene", 500, 70, 70);	
		// kui tegu on komakoha arvudega, siis see on vajalik
		// viimane komakoht n√§itab vea range-i
		assertEquals("inimene", inimene.rynnatakse("inimene2", 1, 0, 0));
	}


	@Test 
	public void test4(){
		
	Character inimene = new Character("inimene", 500, 70, 70);

	
		// kui tegu on komakoha arvudega, siis see on vajalik
		// viimane komakoht n√§itab vea range-i
		assertEquals("elf", inimene.rynnatakse("elf", 1000, 150, 90));
	}

	


	
}