package eecs4313a2b;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import net.sf.borg.common.DateUtil;

public class DTT_minuteString {

	@BeforeClass
	public static void setUp() throws Exception {
		
	}

	@Test
	public void testMinuteString1() {
		// hour = 1
		// min = 1
		assertEquals("1 Hour 1 Minute", DateUtil.minuteString(61));
	}
	
	@Test
	public void testMinuteString2() {
		// hour = 1
		// minute > 1
		assertEquals("1 Hour 2 Minutes", DateUtil.minuteString(62));
	}
	
	@Test
	public void testMinuteString3() {
		// hour = 1
		// minute = 0
		assertEquals("1 Hour", DateUtil.minuteString(60));
	}
	
	@Test
	public void testMinuteString4() {
		// hour > 1
		// minute > 1
		assertEquals("2 Hours 2 Minutes", DateUtil.minuteString(122));
	}
	
	@Test
	public void testMinuteString5() {
		// hour > 1
		// minute = 0
		assertEquals("2 Hours", DateUtil.minuteString(120));
	}
	
	@Test
	public void testMinuteString6() {
		// hour = 0
		// minute = 1
		assertEquals("1 Minute", DateUtil.minuteString(1));
	}
	
	@Test
	public void testMinuteString7() {
		// hour = 0
		// minute > 1
		assertEquals("2 Minutes", DateUtil.minuteString(2));
	}
	
	@Test
	public void testMinuteString8() {
		// hour = 0
		// minute = 0
		assertEquals("0 Minutes", DateUtil.minuteString(0));
	}
}
