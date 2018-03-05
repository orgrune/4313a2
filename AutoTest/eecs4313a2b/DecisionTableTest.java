package eecs4313a2b;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import net.sf.borg.common.EncryptionHelper;

public class DecisionTableTest {
	
	private static String location = "keystore";
	private static String pw = "1234";
	private static String key = "borg_key";
	private static String orginalText = "Hello World!";
	private static String encryptedText;
	private static EncryptionHelper helper;
	
	@BeforeClass
	public static void setUp() throws Exception {
		EncryptionHelper.createStore(location, pw);
		EncryptionHelper.generateKey(location, pw, key);
		helper = new EncryptionHelper(location, pw);
		encryptedText = helper.encrypt(orginalText, key);
	}
	
	@Test(expected=Exception.class)
	public void testWrongKey() throws Exception {
		// wrong key, wrong encrypted text
		helper.decrypt("Hello", "123");
	}
	
	@Test(expected=Exception.class)
	public void testWrongKey2() throws Exception {
		// wrong key, correct encrypted text
		helper.decrypt(encryptedText, "123");
	}
	
	@Test
	public void testDecrypt() throws Exception {
		/**
		 * C1: correct/wrong key
		 * C2: correct/wrong ecryptedText
		 * A1: decryptedText == originalText
		 * A2: decryptedText != originalText
		 */
		
		// correct key, wrong encrypted text
		char t = encryptedText.charAt(0);
		String decryptedText = helper.decrypt(encryptedText.replace(t, (char) (t+1)), key);
		assertFalse(orginalText.equals(decryptedText));
		
		// correct key, correct encrypted text
		decryptedText = helper.decrypt(encryptedText, key);
		assertTrue(orginalText.equals(decryptedText));
	}
}
