/**
 * Boundary value test Day.setValue(int)
 * net.sf.borg.model.Day.setVacation
 */
package eecs4313a2b;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

import net.sf.borg.common.DateUtil;
import net.sf.borg.model.Repeat;
import net.sf.borg.model.entity.Appointment;


public class BVT_calculateRepeatNumber {
	
	@Test
	public void testCalRepeatNumber() {
		int apptDay = 2;
		Calendar apptDate = new GregorianCalendar(0, 0, apptDay, 0, 0);
		
		Appointment appt = new Appointment();
		appt.setFrequency(Repeat.DAILY);
		appt.setDate(apptDate.getTime());
		
		// apptDate = toDate
		Calendar toDate = new GregorianCalendar(0, 0, apptDay, 0, 0);
		assertEquals(1, Repeat.calculateRepeatNumber(toDate, appt));
		
		// toDate = appt date + 1
		toDate.set(0, 0, apptDay + 1);
		assertEquals(2, Repeat.calculateRepeatNumber(toDate, appt));
		
		// toDate = apptDate - 1
		toDate.set(0, 0, apptDay - 1);
		assertEquals(0, Repeat.calculateRepeatNumber(toDate, appt));
		
		// toDate = Integer.MAX_VALUE
		apptDate.set(0, 0, 1);
		appt.setDate(apptDate.getTime());
		toDate.set(0, 0, Integer.MAX_VALUE);
		assertEquals(Integer.MAX_VALUE, Repeat.calculateRepeatNumber(toDate, appt));

		// toDate = Integer.MAX_VALUE - 1
		toDate.set(0, 0, Integer.MAX_VALUE - 1);
		assertEquals(Integer.MAX_VALUE - 1, Repeat.calculateRepeatNumber(toDate, appt));

		// toDate = Integer.MAX_VALUE / 2
		toDate.set(0, 0, Integer.MAX_VALUE / 2);
		assertEquals(Integer.MAX_VALUE / 2, Repeat.calculateRepeatNumber(toDate, appt));
	}
}