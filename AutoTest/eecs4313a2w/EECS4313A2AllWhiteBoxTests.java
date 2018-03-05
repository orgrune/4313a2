package eecs4313a2w;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import eecs4313a2b.BoundaryValueTest;
import eecs4313a2b.DecisionTableTest;
import eecs4313a2b.EquivalentClassTest;

@RunWith(Suite.class)
@SuiteClasses({ BoundaryValueTest.class,
				EquivalentClassTest.class,
				DecisionTableTest.class})
public class EECS4313A2AllWhiteBoxTests {

}
