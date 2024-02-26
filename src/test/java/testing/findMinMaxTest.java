package testing;

import com.mycompany.lab04.findMinMax;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class findMinMaxTest {

	@Test
	public void findMaxMinTest() {

		List<Double> lis = new ArrayList<>();

		findMinMax.findMaxMin(lis);

		lis.add(1.0);

		findMinMax.findMaxMin(lis);

		lis.add(2e35);

		findMinMax.findMaxMin(lis);

		lis.add(2.0);

		findMinMax.findMaxMin(lis);

		lis.clear();

		lis.add(1.0);
		lis.add(0.0);
		lis.add(-1.0);

		findMinMax.findMaxMin(lis);

		lis.clear();

		lis.add(-1.0);
		lis.add(2e35);

		findMinMax.findMaxMin(lis);

		lis.clear();

		lis.add(2e35);

		findMinMax.findMaxMin(lis);

		lis.clear();

		lis.add(-2e35);

		findMinMax.findMaxMin(lis);
		
		lis.clear();
		
		
		lis.add(-1.0);
		lis.add(-2e35);

		findMinMax.findMaxMin(lis);
		
		lis.clear();
		
		
		lis.add(1.0);
		lis.add(-2e35);

		findMinMax.findMaxMin(lis);
		

	}
}
