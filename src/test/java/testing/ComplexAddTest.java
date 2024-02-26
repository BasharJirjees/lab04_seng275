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
		
		assertEquals(3,ca._ComplexAdd(3, 0));
		
		assertEquals(2,ca._ComplexAdd(3, -1));
		
		assertEquals(2,ca._ComplexAdd(-1, -1));
		
		assertEquals(0,ca._ComplexAdd(1, -1));
		
		assertEquals(0,ca._ComplexAdd(-1, 1));
		
        assertEquals(Integer.MAX_VALUE, ca._ComplexAdd(Integer.MAX_VALUE, 0));
        
        assertEquals(Integer.MIN_VALUE, ca._ComplexAdd(Integer.MIN_VALUE, 0));
        
        assertEquals(1000, ca._ComplexAdd(-2000, 1000));
        
        assertEquals(1000, ca._ComplexAdd(2000, -1000));
        
        assertEquals(3000, ca._ComplexAdd(2000, 1000));
        
        assertEquals(3000, ca._ComplexAdd(-2000, -1000));
        
        assertEquals(1, ca._ComplexAdd(Integer.MIN_VALUE, Integer.MAX_VALUE));
        
	}

}
