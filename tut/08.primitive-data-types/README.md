# Java's primitive data types

## Boolean type

`boolean`: `true`/`false`

The number of bytes of the `boolean` type depends on
the implementations of JVMs.

## Integer number types

All numbers are **signed**.
There are no unsigned number data types like in C/C++.

* `byte`: 1 byte, for numbers, from -2^7 to 2^7 minus 1 (-128 to 127)
* `short`
* `int`
* `long`

Note:
- 8 bits unsigned number: from 0 to 2^8 minus 1 (255)
- 8 bits signed number: -2^7 to 2^7 minus 1

## Floating-point types

* `float`: 4 bytes (~ `int`)
* `double`: 8 bytes (~ `long`)

## Character

`char`: 2 bytes, for Unicode UTF-16 characters;
 unlike 1 byte `char` type for both numbers and characters in C/C++!

Must use single quotes for 1 character.

`String`: is a class, not a primitive data type.

## Class type vs primitive type

With a primitive variable, we cannot write:
`primitiveType.someMethod()`
because there are no methods associated with primitive types.

With an object type like `String`, we can call:
`objectType.someMethod()`

## Box types

A box class type is a class that wraps the equivalent primitive type.

* `boolean`: `Boolean`
* `byte`: `Byte`
* `short`: `Short`
* `int`: `Integer`
* `long`: `Long`
* `float`: `Float`
* `double`: `Double`
* `char`: `Character`
