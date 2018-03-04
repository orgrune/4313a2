package eecs4313a2b;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import net.sf.borg.common.DateUtil;
import net.sf.borg.model.TaskModel;
import net.sf.borg.model.db.DBHelper;
import net.sf.borg.model.db.jdbc.JdbcDBHelper;

public class EquivalentClassTest {
	
	@BeforeClass
	public static void setUp() throws Exception {
		// open the borg dbs - in memory
		DBHelper.setFactory(new JdbcDBHelper());
		DBHelper.setController(new JdbcDBHelper());
		DBHelper.getController().connect("jdbc:hsqldb:mem:whatever");
	}

	@Test
	public void testDaysBetween() {
		// R1 = {d1 equals d2}
		// R2 = {d1 is before d2}
		// R3 = {d1 is after d2}
		Date d1 = new Date(2018-1900, 1, 1);
		Date d2 = new Date(2018-1900, 1, 2);
		
		assertEquals(1, TaskModel.daysBetween(d1, d2));
		
		assertEquals(0, TaskModel.daysBetween(d1, d1));
		
		assertEquals(-1, TaskModel.daysBetween(d2, d1));
	}
}
