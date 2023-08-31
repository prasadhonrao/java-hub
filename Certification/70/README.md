# Question 70

```java
Boolean[] bool = new Boolean[2];

bool[0] = new Boolean(Boolean.parseBoolean("true"));
bool[1] = new Boolean(null);
System.out.println(bool[0] + " " + bool[1]);
```

What is the result?

1. True false
2. True null
3. Compilation fails
4. A NullPointerException is thrown at runtime
