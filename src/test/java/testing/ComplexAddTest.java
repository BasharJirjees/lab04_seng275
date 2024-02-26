package testing;

import com.mycompany.lab04.ComplexAdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComplexAddTest {

	@Test
	public void _ComplexAddTest() {
		ComplexAdd ca = new ComplexAdd();
		
		assertEquals(-1,ca._ComplexAdd(1, 0));
		
		assertEquals(0,ca._ComplexAdd(0, 0));
		
		assertEquals(1,ca._ComplexAdd(-1, 0));
		
		assertEquals(1, ca._ComplexAdd(0, -1));
		
		assertEquals(3,ca._ComplexAdd(3, 0));
		
		assertEquals(2,ca._ComplexAdd(3, -1));
		
		assertEquals(2,ca._ComplexAdd(-1, -1));
		
		assertEquals(0,ca._ComplexAdd(1, -1));
		
		assertEquals(0,ca._ComplexAdd(-1, 1));
		
        assertEquals((int) 2e35, ca._ComplexAdd((int) 2e35, 0));
        
        assertEquals((int) 2e35, ca._ComplexAdd((int) 2e35, 0));
        
        assertEquals(1000, ca._ComplexAdd(-2000, 1000));
        
        assertEquals(1000, ca._ComplexAdd(2000, -1000));
        
        assertEquals(3000, ca._ComplexAdd(2000, 1000));
        
        assertEquals(3000, ca._ComplexAdd(-2000, -1000));
        
        assertEquals(0, ca._ComplexAdd(-2000, 2000));
        
        assertEquals(0, ca._ComplexAdd(-2000, 2000));
        
        assertEquals(1, ca._ComplexAdd((int) -2e35, (int) 2e35));
        
        assertEquals((int) 2e35 * 2, ca._ComplexAdd((int) 2e35, (int) 2e35));
        
        
        
	}

}
