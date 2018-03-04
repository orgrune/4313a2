# Black-box testing
### Specification of the selected Java methods
##### 1. net.sf.borg.common.DateUtils
```java
public static int daysBetween(Date d1, Date d2)
```
```
This method checks if one date falls on a later calendar than another.

Parameters:
* d1 - The first date.
* d2 - The second date.

Returns:
* the number of days between d1 and d2
```

##### 2. net.sf.borg.common.EncryptionHelper
```java
public String decrypt(String cipherText, String keyAlias)
```
```
This method decrypts a string using a key from the key store
If the keystore doesn't already exist, then it'll throw an exception.

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
##### 1. net.sf.borg.common.TaskModel.isBetween(Date, Date)
```
We used weak normal equivalent class testing to test this method because it can be
expressed as a function of two variables.
Its input and output variables have well-defined intervals and are dependant from each
other.
```
##### 2. net.sf.borg.common.EncryptionHelper.decrypt(String, String)
```
We used decision table testing to test this method because 
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
