package eecs4313a2w;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import eecs4313a2b.BVT_calculateRepeatNumber;
import eecs4313a2b.DTT_minuteString;
import eecs4313a2b.ECT_daysBetween;

@RunWith(Suite.class)
@SuiteClasses({ BVT_calculateRepeatNumber.class,
		ECT_daysBetween.class,
		DTT_minuteString.class})
public class EECS4313A2AllWhiteBoxTests {

}
