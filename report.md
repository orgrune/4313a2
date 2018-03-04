# Black-box testing
### Specification of the selected Java methods
##### 1. net.sf.borg.common.DateUtils
```java
public static boolean isAfter(Date d1, Date d2)
```
```
This method checks if one date falls on a later calendar than another.

Parameters:
* d1 - The first date.
* d2 - The second date.

Returns:
* true - if d2 is after d1
* false - if d2 is before or the same as d1
```

##### 2. net.sf.borg.common.EncryptionHelper
```java
public String decrypt(String cipherText, String keyAlias)
```
```
This method decrypts a string using a key from the key store

Parameters:
* cipherText - the string to decrypt
* keyAlias - the decryption key

Returns:
* The encrypted (original) string
```

##### 3. net.sf.borg.common.DateUtil
```java
public static String minuteString(int i)
```
```
This method generate a human readable string for a number of minutes
in the following format [n Hour[s]] m Minute[s]
Since we don't deal with negative time in this calendar app, we can
expect the param i to be positive.
Parameters:
* i - the number of minutes to convert.
```

---
### Justification of the testing technique chosen
##### 1. net.sf.borg.common.DateUtils.isAfter(Date, Date)
```
We used equivalent class testing to test this method because...
```
##### 2. net.sf.borg.common.EncryptionHelper.decrypt(String, String)
```
We used decision table testing to test this method because...
```
##### 3. net.sf.borg.common.DateUtils.minuteString(int)
```
We used boundary value testing to test this method because...
```

---
### Description of application
```
TODO
```
---
### Evaluation of the test cases derived by testing technique
```
TODO
```
---
### Bug reports (if any)
TODO

# White-box testing
```
TODO
```
---
### Statement coverage measurements
```
TODO
```

---
### Description of test additional test cases
```
TODO
```

---
### Statement coverage measurements of final tests
```
TODO
```

---
### Control Flow Graph
```
TODO
```

---
### Bug reports (if any)
```
TODO
```

---
### Appendix
```
TODO
```
