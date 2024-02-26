package testing;
import com.mycompany.lab04.Splitting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.stream.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;


class SplittingTest {



    @Test
    public void canBalanceTest(){


        int [] nums ;

        nums = null;


        // Testing when array is null

        assertFalse(Splitting.canBalance(nums));



        nums = new int[0];


        // Testing when array size is below 1

        assertFalse(Splitting.canBalance(nums));


        nums = new int[1];


        // Testing when array size equals 1

        assertFalse(Splitting.canBalance(nums));


        nums = new int[3];


        // Testing when array size equals larger than 1 while the array is empty

        assertTrue(Splitting.canBalance(nums));

        int [] nums_2 = {1,2,2,1};


        // Testing when array size is larger than 1 while the array contains a split with 2 equal sums

        assertTrue(Splitting.canBalance(nums_2));

        int [] nums_3 = {1,2,3,1};


        // Testing when array size is larger than 1 while the array contains no split with equal sums

        assertFalse(Splitting.canBalance(nums_3));
        
        
        // Testing when all elements are similar and array contains a split with equal sums
        
        int [] nums_4 = {0,0,0,0};
        
        
        assertTrue(Splitting.canBalance(nums_4));
        
        
        // Testing when all elements are different with minimal size when all elements are different
        
        int [] nums_5 = {3,1};
        
        
        assertFalse(Splitting.canBalance(nums_5));

        


    }
}