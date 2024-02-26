package testing;
import com.mycompany.lab04.CollectionUtils;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;


class CollectionUtilsTest {
    private static ArrayList<Integer> arr1;
    private static ArrayList<Integer> arr2;



    @BeforeAll
    public static void init() {
        arr1 = new ArrayList<>();
        arr2 = new ArrayList<>();

    }

    @Test
    public void containsAnyTest() {

        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        arr2.add(3);
        arr2.add(2);
        arr2.add(1);


        // Testing when the array sizes are equal with similar elements
        assertTrue(CollectionUtils.containsAny(arr1, arr2));

        arr2.add(4);


        // Testing when the array 2 size is larger than array 1 while
        // containing similar elements

        assertTrue(CollectionUtils.containsAny(arr1, arr2));

        arr1.clear();
        arr1.add(5);
        arr1.add(6);


        // Testing when both arrays have different sizes while containing different elements

        assertFalse(CollectionUtils.containsAny(arr1, arr2));

        arr2.clear();
        arr2.add(7);
        arr2.add(8);


        // Testing when both arrays have same sizes while containing different elements

        assertFalse(CollectionUtils.containsAny(arr1, arr2));

    }

}