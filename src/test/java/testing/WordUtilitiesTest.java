/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package testing;

import com.mycompany.lab04.WordUtilities;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author basha
 */

public class WordUtilitiesTest {

	@Test
	public void swapCaseTest() {
		
		//Testing with null string
		
		assertEquals(null, WordUtilities.swapCase(null));
		
		
		//Testing with empty string
		
		assertEquals("", WordUtilities.swapCase(""));
		
		
		//Testing with non-empty and non-null string
		
		assertEquals("ba", WordUtilities.swapCase("BA"));
		
		
		//Testing with non-empty and non-null string while containing white space
		
		assertEquals("b a", WordUtilities.swapCase("B A"));
		
		
		//Testing with non-empty and non-null string while containing white space
		
		assertEquals(" Ab", WordUtilities.swapCase(" aB"));
		
		
		//Testing with non-empty and non-null string while containing white space
		
		assertEquals("AB", WordUtilities.swapCase("ab"));
		
		//Testing with non-empty and non-null string while containing white space
		
		assertEquals("AB ", WordUtilities.swapCase("ab "));
		
	}
}
