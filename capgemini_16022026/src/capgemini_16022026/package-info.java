package capgemini_16022026;

// difference between String s1 = new String("Hello"); and String s2 = "Hello";
// In Java, there are two ways to create a String: using the String literal and using the String constructor.
// 1. String s1 = new String("Hello"); 
// This creates a new String object in the heap memory. Even if there is already a String with the same content ("Hello") in the string pool, this line will create a new object. So, s1 will reference a different object than any existing "Hello" in the string pool.
// 2. String s2 = "Hello";
// This creates a String literal. If there is already a String with the content "Hello" in the string pool, s2 will reference that existing object. If there isn't, it will create a new String object in the string pool and s2 will reference it.

