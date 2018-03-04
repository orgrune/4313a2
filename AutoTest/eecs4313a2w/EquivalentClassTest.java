package eecs4313a2w;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import net.sf.borg.common.DateUtil;

public class EquivalentClassTest {
	Date d1 = new Date();
	Date d2 = new Date();
	
	@Before
	public void setUp() throws Exception {
		d2.setMonth(d1.getMonth() + 1);;
	}

	@Test
	public void testIsAfter() {
		// R1 = {d1 equals d2}
		// R2 = {d1 is before d2}
		// R3 = {d1 is after d2}
		
		assertFalse(DateUtil.isAfter(d1, d1));
		
		assertFalse(DateUtil.isAfter(d2, d1));
		
		assertTrue(DateUtil.isAfter(d1, d2));
	}
}
