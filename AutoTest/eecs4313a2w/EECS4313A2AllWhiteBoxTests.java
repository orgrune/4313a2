package eecs4313a2w;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import eecs4313a2b.BoundaryValueTest;
import eecs4313a2b.DTT_minuteString;
import eecs4313a2b.EquivalentClassTest;

@RunWith(Suite.class)
@SuiteClasses({ BoundaryValueTest.class,
				EquivalentClassTest.class,
				DTT_minuteString.class})
public class EECS4313A2AllWhiteBoxTests {

}
