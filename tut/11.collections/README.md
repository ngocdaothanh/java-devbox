# Basic collections in Java

All of them are in package `java.util`.

## Interfaces

- `List`
- `Map`
- `Set`

## Concrete implementations

- `List`: `ArrayList`
- `Map`: `HashMap`
- `Set`: `HashSet`

## Cannot use primitive types as collection items

This does not work:

```java
List<int>
```

This works:

```java
List<Integer>
```

That's why for each primitive type,
there's an equivalent "box" class type.
