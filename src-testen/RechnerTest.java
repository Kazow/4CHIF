import static org.junit.Assert.*;

import org.junit.Test;


public class RechnerTest {

	@Test
	public void testAdd() {
		Rechner r = new Rechner();
		int a = r.add(5,6);
		assertEquals("add",11 , a);
	}
	
	public void testDiv(){
		Rechner r = new Rechner();
		int a = r.div(3, 0);
	}
	
	
	

}
