/**
 * Boundary value test Day.setValue(int)
 * net.sf.borg.model.Day.setVacation
 */
package eecs4313a2b;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import net.sf.borg.model.Day;
import net.sf.borg.model.db.DBHelper;
import net.sf.borg.model.db.jdbc.JdbcDBHelper;

public class BoundaryValueTest {

	private static Day day;
	private static int min, max;
	
	@BeforeClass
	public static void setUp() throws Exception {
		DBHelper.setFactory(new JdbcDBHelper());
		DBHelper.setController(new JdbcDBHelper());
		DBHelper.getController().connect("jdbc:hsqldb:mem:whatever");
		day = Day.getDay(2018, 3, 1);
		min = Integer.MIN_VALUE;
		max = Integer.MAX_VALUE;
	}
	
	@Test
	public void testSetVacation() {
		// min
		int v = min;
		day.setVacation(v);
		assertEquals("Vacation value = " + String.valueOf(v), v, day.getVacation());
		
		// max
		v = max;
		day.setVacation(v);
		assertEquals("Vacation value = " + String.valueOf(v), v, day.getVacation());
	
		// min + 1
		v = min + 1;
		day.setVacation(v);
		assertEquals("Vacation value = " + String.valueOf(v), v, day.getVacation());
	
		// max - 1
		v = max - 1;
		day.setVacation(v);
		assertEquals("Vacation value = " + String.valueOf(v), v, day.getVacation());
		
		// nominal
		v = (max + min) / 2;
		day.setVacation(v);
		assertEquals("Vacation value = " + String.valueOf(v), v, day.getVacation());
	}
}
