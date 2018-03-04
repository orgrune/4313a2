/**
 * Boundary value test Day.setValue(int)
 * net.sf.borg.model.Day.setVacation
 */
package eecs4313a2b;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import net.sf.borg.common.DateUtil;


public class BoundaryValueTest {
	
	@Test
	public void testMinuteString() {
		int min = 0, // 0 since we're not dealing with negative date/time in this app
			max = Integer.MAX_VALUE;
		// min
		assertEquals("0 Minutes", DateUtil.minuteString(0));
		
		// min + 1
		assertEquals("1 Minute", DateUtil.minuteString(min + 1));
		
		// max
		assertEquals(simpleOracle(max), DateUtil.minuteString(max));
		
		// max - 1
		assertEquals(simpleOracle(max - 1), DateUtil.minuteString(max - 1));
		
		// nominal
		assertEquals(simpleOracle(max / 2), DateUtil.minuteString(max / 2));
	}
	
	private static String simpleOracle(int i) {
		return i / 60 + " Hours " + i % 60 + " Minutes";
	}
}
